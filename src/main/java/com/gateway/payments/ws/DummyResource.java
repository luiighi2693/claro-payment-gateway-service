package com.gateway.payments.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import com.gateway.payments.domain.ProcessCreditCardRequest;
import com.google.gson.Gson;
@Path("dummy")
public class DummyResource {
	@Context
    private UriInfo context;
    
    protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(CreditCardResource.class.getName());
	  @GET
	    @Path("decirHola")
	    public String decirHola() throws JSONException {
	       //TODO return proper representation object
	        //throw new UnsupportedOperationException();
	        logger.info("Llamando Metodo");
	        ResponseBuilder rb=Response.status(200);// ok();
//	            rb.header("Access-Control-Allow-Origin", "*");
//	            rb.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
//	        rb.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
	        
	        return "Hola";
	        //return rb.entity("Hola Mundo: "+str).build();
	    }
	    @GET
	    @Path("decirHola1")
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response decirHola1() throws JSONException {
	       //TODO return proper representation object
	        //throw new UnsupportedOperationException();
	        logger.info("Llamando Metodo decirHola1");
	        ProcessCreditCardRequest p=new ProcessCreditCardRequest();
	        p.setCardNum("1234567890");
	        String aux = p.generateJSONObject().toString();
	        
	        ResponseBuilder rb=Response.status(200);
	        logger.info("Fin del metodo processCreditCard");
	        return rb.entity(aux).build();
	        
	        //return p;
	        //return rb.entity("Hola Mundo: "+str).build();
	    }
	    @Path("decirHola2")
	    @POST
//	    @Consumes("text/plain")
	    public void decirHola2(String message) {
	       //TODO return proper representation object
	        //throw new UnsupportedOperationException();
	        logger.info("Llamando Metodo decirHola2");
	        logger.info("Mensaje: "+message);
	        
	    }
	    @Path("decirHola3")
	    @POST
	    @Produces(MediaType.APPLICATION_JSON)
//	    @Consumes("text/plain")
	    public Response decirHola3(String message)throws JSONException {
	       //TODO return proper representation object
	        //throw new UnsupportedOperationException();
	        logger.info("Llamando Metodo decirHola3");
	        logger.info("Mensaje: "+message);
	        ProcessCreditCardRequest p=new ProcessCreditCardRequest();
	        p.setCardNum("1234567890");
	        String aux = p.generateJSONObject().toString();
	        ResponseBuilder rb=Response.status(200);
	        return rb.entity(aux).build();
	        
	    }
	    @Path("decirHola4")
	    @POST
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response decirHola4(String jsonString) throws JSONException {
	       //TODO return proper representation object
	        //throw new UnsupportedOperationException();
	    	
	   	
	        logger.info("Llamando Metodo decirHola4");
	        logger.info("Valor del JSON_String: "+jsonString);
	        MyJson json=getObject(jsonString, MyJson.class);
	        json.setKey(json.getKey()+"PROCESS");
	        String aux = json.generateJSONObject().toString();
	        
	        ResponseBuilder rb=Response.status(200);
	        logger.info("Fin del metodo processCreditCard");
	        return rb.entity(aux).build();
	    }
	    @Path("decirHola5")
	    @POST
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Produces(MediaType.APPLICATION_JSON)
	    public Response decirHola5(MyJson json) throws JSONException {
	       //TODO return proper representation object
	        //throw new UnsupportedOperationException();
	    	
	   	
	        logger.info("Llamando Metodo decirHola4");
	        logger.info("Valor del JSON: "+json.toString());
	        json.setKey(json.getKey()+"PROCESS_RecieveJSON");
	        String aux = json.generateJSONObject().toString();
	        
	        ResponseBuilder rb=Response.status(200);
	        logger.info("Fin del metodo processCreditCard");
	        return rb.entity(aux).build();
	    }
	    public static <T> T getObject(final String jsonString, final Class<T> objectClass) { 
	        Gson gson = new Gson();  
	        return gson.fromJson(jsonString, objectClass);  
	    }
}
class MyJson{
	private String key;
	public MyJson(){
		
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
    public JSONObject generateJSONObject()throws JSONException{
        JSONObject output = new JSONObject();
        output.put("key", key);
        return output;
    }
}
