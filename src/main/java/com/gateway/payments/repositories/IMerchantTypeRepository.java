package com.gateway.payments.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.e4gslab.ebill.payment.gateway.model.Aplication;
import com.e4gslab.ebill.payment.gateway.model.MerchantType;

public interface IMerchantTypeRepository extends CrudRepository<MerchantType, String>{
	
	MerchantType findByMerchantTypeId(@Param("merchantTypeId") String merchantTypeId);
}
