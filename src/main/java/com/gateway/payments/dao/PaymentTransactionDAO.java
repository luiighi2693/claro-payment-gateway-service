package com.gateway.payments.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.e4gslab.ebill.payment.gateway.model.PaymentTransaction;
import com.gateway.payments.domain.ResponseCreditCardProcess;
import com.gateway.payments.repositories.IPaymentTransactionRepository;

@Component
public class PaymentTransactionDAO {

	public PaymentTransactionDAO() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private IPaymentTransactionRepository paymentTransactionRepository;

	public Iterable<PaymentTransaction> findAll(){
		
		return paymentTransactionRepository.findAll();
	}
	
	public void save(PaymentTransaction payment){
		
		paymentTransactionRepository.save(payment);
	}
	
	public boolean existTransaction(PaymentTransaction payment){
		
		PaymentTransaction paymentBD=paymentTransactionRepository.findByIdPaymentTransaction(payment.getIdPaymentTransaction());
		
		if(paymentBD!=null&&paymentBD.getAplicationId().equals(payment.getAplicationId())){
			return true;
		}
		
		return false;
	}
	
	public PaymentTransaction getTransaction(PaymentTransaction payment){
		
		return paymentTransactionRepository.findByIdPaymentTransaction(payment.getIdPaymentTransaction());
	}
	
	public boolean existTransactionId(String idTransaction){
		
		if(paymentTransactionRepository.findByIdPaymentTransaction(idTransaction)!=null){
			return true;
		}
		return false;
	}
	
	public PaymentTransaction updatePaymentWithResponse(PaymentTransaction payment,ResponseCreditCardProcess response){
		
		PaymentTransaction paymentDB = paymentTransactionRepository.findByIdPaymentTransaction(payment.getIdPaymentTransaction());
		paymentDB.setAuthCode(response.getAuthCode());
		paymentDB.setMessage(response.getMessage());
		paymentDB.setResponseCode(response.getResponseCode());
		
		if(response.getResponseCode().equals("0")){
			paymentDB.setStatus("P");//PENDING
		}
		else{
			paymentDB.setStatus("F");//FAILED
		}
		save(paymentDB);
		
		return paymentDB;
	}
}
