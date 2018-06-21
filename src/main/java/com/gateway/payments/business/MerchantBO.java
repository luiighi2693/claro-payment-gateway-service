package com.gateway.payments.business;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.e4gslab.ebill.payment.gateway.model.Merchant;
import com.gateway.payments.dao.MerchantDAO;

@Component
public class MerchantBO {
	
	@Autowired
	MerchantDAO merchantDAO;
	
	public MerchantBO() {
		// TODO Auto-generated constructor stub
	}
	
	public Merchant getDefaultMerchantByApplicationId(String applicationId) {
		
		return merchantDAO.getDefaultMerchantByApplicationId(applicationId);
		
	}

}
