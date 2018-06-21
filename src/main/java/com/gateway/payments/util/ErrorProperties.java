package com.gateway.payments.util;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ErrorProperties {
	
	protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger
			.getLogger(ErrorProperties.class.getName());
	
	@Value("#{configurationError['codError1']}")
	private String codError1;
	@Value("#{configurationError['description1']}")
	private String description1;
	@Value("#{configurationError['codError2']}")
	private String codError2;
	@Value("#{configurationError['description2']}")
	private String description2;
	@Value("#{configurationError['codError3']}")
	private String codError3;
	@Value("#{configurationError['description3']}")
	private String description3;
	@Value("#{configurationError['codError4']}")
	private String codError4;
	@Value("#{configurationError['description4']}")
	private String description4;
	@Value("#{configurationError['codError5']}")
	private String codError5;
	@Value("#{configurationError['description5']}")
	private String description5;
	
	private Map<String,String> errorCod;
	private Map<String,String> errorDes;

	public ErrorProperties() {
		super();
		this.errorCod=new HashMap<String, String>();
		this.errorDes=new HashMap<String, String>();
	}

	@PostConstruct
	public void afterConstruction() {
		errorCod.put("codError1", codError1);
		errorDes.put("codError1", description1);
		errorCod.put("codError2", codError2);
		errorDes.put("codError2", description2);
		errorCod.put("codError3", codError3);
		errorDes.put("codError3", description3);
		errorCod.put("codError4", codError4);
		errorDes.put("codError4", description4);
		errorCod.put("codError5", codError5);
		errorDes.put("codError5", description5);
		
		logger.info("codError: "+codError1+ " Descripcion: "+description1);
		logger.info("codError: "+codError2+ " Descripcion: "+description2);
		logger.info("codError: "+codError3+ " Descripcion: "+description3);
		logger.info("codError: "+codError4+ " Descripcion: "+description4);
		logger.info("codError: "+codError5+ " Descripcion: "+description5);
		logger.info("Errores cargados");
	}

	public Map<String, String> getErrorCod() {
		return errorCod;
	}


	public void setErrorCod(Map<String, String> errorCod) {
		this.errorCod = errorCod;
	}

	public Map<String, String> getErrorDes() {
		return errorDes;
	}

	public void setErrorDes(Map<String, String> errorDes) {
		this.errorDes = errorDes;
	}
	
	
}
