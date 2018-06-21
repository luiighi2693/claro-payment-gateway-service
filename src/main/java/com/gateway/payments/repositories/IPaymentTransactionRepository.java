package com.gateway.payments.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.e4gslab.ebill.payment.gateway.model.PaymentTransaction;

public interface IPaymentTransactionRepository extends CrudRepository<PaymentTransaction, String> {
	
	PaymentTransaction findByIdPaymentTransaction(@Param("idPaymentTransaction") String idPaymentTransaction);
}
