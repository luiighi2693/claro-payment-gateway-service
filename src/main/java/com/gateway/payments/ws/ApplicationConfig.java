/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gateway.payments.ws;

import java.util.Set;

import javax.ws.rs.core.Application;

/**
 *
 * @author jrodriguez
 */
public class ApplicationConfig extends Application {
	
	protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ApplicationConfig.class.getName());
	
	@Override
	public Set<Class<?>> getClasses() {
		
		Set<Class<?>> resources = new java.util.HashSet<>();
		addRestResourceClasses(resources);

		return resources;
	}

	private void addRestResourceClasses(Set<Class<?>> resources) {
		
		logger.info("Ejecutando el metodo: addRestResourceClasses()");
		
		resources.add(com.gateway.payments.filter.RESTCorsDemoRequestFilter.class);
		resources.add(com.gateway.payments.filter.RESTCorsDemoResponseFilter.class);
		resources.add(com.gateway.payments.ws.CreditCardResource.class);
		resources.add(com.gateway.payments.ws.CreditCardResourceH2H.class);
		resources.add(com.gateway.payments.ws.DebitCardResource.class);
		resources.add(com.gateway.payments.ws.TransactionResource.class);
		resources.add(com.gateway.payments.ws.DummyResource.class);

	}
}
