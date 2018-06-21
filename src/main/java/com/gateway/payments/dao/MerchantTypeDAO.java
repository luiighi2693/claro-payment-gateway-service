package com.gateway.payments.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.e4gslab.ebill.payment.gateway.model.MerchantType;
import com.gateway.payments.repositories.IMerchantTypeRepository;

@Component
@Transactional("payment-gateway")
public class MerchantTypeDAO {
	
	@PersistenceContext(unitName = "ebill-payments-gateway-model")
	private EntityManager em;
	
	@Autowired
	private IMerchantTypeRepository merchantTypeRepository;
	
	public MerchantTypeDAO() {
		// TODO Auto-generated constructor stub
	}
}
