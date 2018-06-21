/*
 * @(#)AppConstants.java  09/10/2014
 *
 * Copyright (c) 2003-2014  Totaltexto.
 * Caracas - Venezuela
 * Proyecto Migracion del servicio token del BBVA.
 * All rights reserved.
 *
 * Mas informacion y descripcion del Copyright.
 *
 */
package com.gateway.payments.properties;

/**
 * Esta clase define el enlace con el archivo de configuracion ha se rusados en
 * el webservices SmsGatewayService.
 *
 * @author: Juan Carlos Rodriguez
 *
 * @version: 1
 */
final public class AppConstants {

    public static final String WSDL 						="key.wsdl";
    
    public static final String PROCESS_CREDICARD_USER		="key.WSDL.processCreditCard.user";
    public static final String PROCESS_CREDICARD_PASSWORD	="key.WSDL.processCreditCard.password";
    public static final String PROCESS_CREDICARD_TRANSTYPE	="key.WSDL.processCreditCard.transType";
    
    public static final String MERCHANT_H2H_ENDPOINT 		="merchant.h2h.endPoint";
    public static final String MERCHANT_H2H_USERNAME		="merchant.h2h.username";
    public static final String MERCHANT_H2H_PASSWORD		="merchant.h2h.password";
    
    public static final String MERCHANT_MMPAY_ENDPOINT		="merchant.mmpay.endPoint";
    
}
