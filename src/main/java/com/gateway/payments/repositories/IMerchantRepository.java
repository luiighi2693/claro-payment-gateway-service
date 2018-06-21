package com.gateway.payments.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.e4gslab.ebill.payment.gateway.model.Aplication;
import com.e4gslab.ebill.payment.gateway.model.Merchant;

public interface IMerchantRepository extends CrudRepository<Merchant, String>{
		
	Merchant findByMerchantId(@Param("merchantId") String merchantId);
	
}
