package com.gateway.payments.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.e4gslab.ebill.payment.gateway.model.AuthorizationIpApplication;
import com.e4gslab.ebill.payment.gateway.model.AuthorizationIpApplicationPK;
import com.gateway.payments.repositories.IApplicationIPAuthorization;

@Component
public class AuthorizationApplicationDAO {
	
	@Autowired
	private IApplicationIPAuthorization  applicationIPAuthorizationRepository;
	
	public AuthorizationApplicationDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public AuthorizationIpApplication getAuthorization(AuthorizationIpApplicationPK authorizationIpApplicationPK){
		
		return applicationIPAuthorizationRepository.findByAuthorizationIpApplicationPK(authorizationIpApplicationPK);
		
	}
}
