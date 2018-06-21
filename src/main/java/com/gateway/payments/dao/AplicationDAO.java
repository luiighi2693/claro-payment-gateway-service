package com.gateway.payments.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.e4gslab.ebill.payment.gateway.model.Aplication;
import com.gateway.payments.repositories.IAplicationRepository;

@Component
public class AplicationDAO {
	
	@Autowired
	private IAplicationRepository aplicationRepository;
	
	public AplicationDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getDescripcionAplication(String aplicationId){
		
		return aplicationRepository.findByAplicationId(aplicationId).getDescripcion();
		
	}
	public Aplication getAplication(String aplicationId){
		
		return aplicationRepository.findByAplicationId(aplicationId);
		
	}
}
