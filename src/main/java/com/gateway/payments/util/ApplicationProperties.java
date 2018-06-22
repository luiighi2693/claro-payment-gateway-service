package com.gateway.payments.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Component
public class ApplicationProperties {

	protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger
			.getLogger(ApplicationProperties.class.getName());

	@Value("#{configurationApp['merchant.credit.h2h.endPoint']}")
	private String merchantH2hCreditEndpoint;
	@Value("#{configurationApp['merchant.credit.h2h.username']}")
	private String merchantH2hCreditUsername;
	@Value("#{configurationApp['merchant.credit.h2h.password']}")
	private String merchantH2hCreditPassword;
	@Value("#{configurationApp['merchant.credit.h2h.id']}")
	private String merchantH2hCreditId;
	@Value("#{configurationApp['merchant.credit.h2h.name']}")
	private String merchantH2hCreditName;
	@Value("#{configurationApp['merchant.credit.h2h.createddate']}")
	private String merchantH2hCreditCreatedDate;
	@Value("#{configurationApp['merchant.credit.h2h.updateddate']}")
	private String merchantH2hCreditUpdatedDate;
	@Value("#{configurationApp['merchant.credit.h2h.typeid']}")
	private String merchantH2hCreditTypeId;
	@Value("#{configurationApp['merchant.credit.h2h.enabled']}")
	private String merchantH2hCreditEnabled;

	@Value("#{configurationApp['merchant.credit.h2h.applicationid']}")
	private String merchantH2hCreditApplicationId;
	@Value("#{configurationApp['merchant.credit.h2h.keyencrypt']}")
	private String merchantH2hCreditKeyEncript;

	@Value("#{configurationApp['merchant.type.credit.h2h.id']}")
	private String merchantTypeH2hCreditId;
	@Value("#{configurationApp['merchant.type.credit.h2h.name']}")
	private String merchantTypeH2hCreditName;
	@Value("#{configurationApp['merchant.type.credit.h2h.createddate']}")
	private String merchantTypeH2hCreditCreatedDate;
	@Value("#{configurationApp['merchant.type.credit.h2h.enabled']}")
	private String merchantTypeH2hCreditEnabled;

	private Map<String,String> appCod;
	private Map<String,String> appDes;

	public ApplicationProperties() {
		super();
		this.appCod=new HashMap<String, String>();
	}

	@PostConstruct
	public void afterConstruction() {
		appCod.put("merchantH2hCreditEndpoint", merchantH2hCreditEndpoint);
		appCod.put("merchantH2hCreditUsername", merchantH2hCreditUsername);
		appCod.put("merchantH2hCreditPassword", merchantH2hCreditPassword);
		appCod.put("merchantH2hCreditId", merchantH2hCreditId);
		appCod.put("merchantH2hCreditName", merchantH2hCreditName);
		appCod.put("merchantH2hCreditCreatedDate", merchantH2hCreditCreatedDate);
		appCod.put("merchantH2hCreditUpdatedDate", merchantH2hCreditUpdatedDate);
		appCod.put("merchantH2hCreditTypeId", merchantH2hCreditTypeId);
		appCod.put("merchantH2hCreditEnabled", merchantH2hCreditEnabled);

		appCod.put("merchantH2hCreditApplicationId", merchantH2hCreditApplicationId);
		appCod.put("merchantH2hCreditKeyEncript", merchantH2hCreditKeyEncript);

		appCod.put("merchantTypeH2hCreditId", merchantTypeH2hCreditId);
		appCod.put("merchantTypeH2hCreditName", merchantTypeH2hCreditName);
		appCod.put("merchantTypeH2hCreditCreatedDate", merchantTypeH2hCreditCreatedDate);
		appCod.put("merchantTypeH2hCreditEnabled", merchantTypeH2hCreditEnabled);
	}

	public Map<String, String> getAppCod() {
		return appCod;
	}


	public void setAppCod(Map<String, String> appCod) {
		this.appCod = appCod;
	}
	
}
