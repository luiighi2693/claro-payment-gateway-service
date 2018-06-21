/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gateway.payments.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.tempuri.cpsh2h.serviceh2h.SendTransactionsResponseSendTransactionsResult;

import com.e4gslab.ebill.payment.gateway.model.Aplication;
import com.e4gslab.ebill.payment.gateway.model.PaymentTransaction;
import com.gateway.payments.dao.AplicationDAO;
import com.gateway.payments.dao.PaymentTransactionDAO;
import com.gateway.payments.domain.TransactionH2HRequest;
import com.gateway.payments.domain.TransactionH2HResponse;
import com.gateway.payments.domain.TransactionRequest;
import com.gateway.payments.domain.TransactionResponse;
import com.gateway.payments.util.MerchantH2HUtil;
import com.google.gson.Gson;

/**
 * REST Web Service
 *
 * @author jmercado
 */
@Path("transaction")
public class TransactionResource {

    @Context
    private UriInfo context;
    
    @Autowired
    private PaymentTransactionDAO paymentDAO;
    
    @Autowired
    private AplicationDAO appDAO;
    
    protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(TransactionResource.class.getName());

    /**
     * Creates a new instance of TransactionResource
     */
    public TransactionResource() {
    }

    /**
     * Retrieves representation of an instance of
     * com.gateway.payments.ws.TransactionResource
     *
     * @return an instance of com.gateway.payments.domain.TransactionRequest
     */
    @GET
    @Produces("application/json")
    public TransactionRequest getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of TransactionResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(TransactionRequest content) {
    }

    @POST
    @Path("sendTransactionH2H")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TransactionH2HResponse sendTransactionH2H(TransactionH2HRequest request) {

    	MerchantH2HUtil merchantH2HUtil = new MerchantH2HUtil();
    	
    	TransactionH2HResponse transactionH2HResponse = merchantH2HUtil.sendTransactions(request);
    	
    	return transactionH2HResponse;
    	
    }
    
    @POST
    @Path("checkTransaction")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response checkTransaction(TransactionRequest request) {

        logger.info("checkTransaction.getAplicationId():" + request.getAplicationId());
        logger.info("checkTransaction.getTransactionId(): " + request.getTransactionId());

        try {
        	TransactionResponse response = new TransactionResponse();
        	Aplication app = appDAO.getAplication(request.getAplicationId());
        	String responseString;
        	
        	if(app!=null){
        		
        		PaymentTransaction paymentRequest=new PaymentTransaction();
            	paymentRequest.setAplicationId(app);
            	paymentRequest.setIdPaymentTransaction(request.getTransactionId());
            	PaymentTransaction paymentRequestDB = paymentDAO.getTransaction(paymentRequest);
            	
            	if(paymentRequestDB==null){
            		// transaction not exists
            		response.setTransactionExist(Boolean.FALSE);
        			response.setMsg("Transaccion "+request.getTransactionId() + " No existe");
        			
            	} else {
            		// transaction exists
	            	if(paymentRequestDB.getStatus().equals("P")){
	            		
	            		// transaction exists, change the state to read R
	            		paymentRequestDB.setStatus("R");
	            		paymentDAO.save(paymentRequestDB);

	            		response.setPCRFTransaID(paymentRequestDB.getPCRFTransaID());
	            		response.setTransactionExist(Boolean.TRUE);
	            		response.setAuthCode(paymentRequestDB.getAuthCode());
	            		response.setMsg("OK");
	            		// return status P from first time read
	            		response.setStatus("P");
	            		
	            	} else {
	            		
	            		// transaction already read  
	            		if(paymentRequestDB.getStatus().equals("R")){
	            			
	            			response.setTransactionExist(Boolean.TRUE);
	            			response.setMsg("Trasaccion "+request.getTransactionId()+" ya fue Leida");
	            			response.setStatus("R");
	            			
	            		} else {
	            			
	            			// transaction fail
	            			if(paymentRequestDB.getStatus().equals("F")){
	            				
	                			response.setTransactionExist(Boolean.TRUE);
	                			response.setMsg("Trasaccion "+request.getTransactionId()+" habia fallado");
	                			response.setStatus("F");
	                			
	                		} else {
	                			
		            			response.setTransactionExist(Boolean.FALSE);
		            			response.setMsg("Deconocido STATUS para la transaccion "+request.getTransactionId());
		            			response.setStatus(paymentRequestDB.getStatus());
		            			
	            			}
	            		}
	            	}
            	}
            	
        	} else {
        		// transaction not exits 
        		response.setTransactionExist(Boolean.FALSE);
        		response.setMsg("Aplicacion "+request.getAplicationId() + " No existe");
        	}
        	
        	// ok() 
            Response.ResponseBuilder rb = Response.status(200);           
            return rb.entity(response.generateJSONObject().toString()).build();

        } catch (Exception e) {
        	e.printStackTrace();
        	
            logger.error("Existe un error " + e.toString());
            
            return Response.status(Response.Status.NOT_FOUND).entity("Error generico en el metodo checkTransaction").build();
        }
    }
    public static <T> T getObject(final String jsonString, final Class<T> objectClass) {  
        Gson gson = new Gson();  
        return gson.fromJson(jsonString, objectClass);  
    }
}
