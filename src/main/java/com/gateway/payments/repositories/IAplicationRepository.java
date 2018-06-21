package com.gateway.payments.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.e4gslab.ebill.payment.gateway.model.Aplication;

public interface IAplicationRepository extends CrudRepository<Aplication, String>{
	
	Aplication findByAplicationId(@Param("aplicationId") String aplicationId);
}
