/**
 * 
 */
package com.gateway.payments.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.e4gslab.ebill.payment.gateway.model.AuthorizationIpApplication;
import com.e4gslab.ebill.payment.gateway.model.AuthorizationIpApplicationPK;

/**
 * @author jmercado
 *
 */
public interface IApplicationIPAuthorization extends CrudRepository<AuthorizationIpApplication, AuthorizationIpApplicationPK>{
	
	AuthorizationIpApplication findByAuthorizationIpApplicationPK(@Param("authorizationIpApplicationPK") AuthorizationIpApplicationPK authorizationIpApplicationPK);
}
