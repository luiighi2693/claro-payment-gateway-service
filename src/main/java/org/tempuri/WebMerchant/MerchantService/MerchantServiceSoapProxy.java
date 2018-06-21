package org.tempuri.WebMerchant.MerchantService;

import TransactionSearch.MMPay.Evertec.TransactionSearchRequest;

public class MerchantServiceSoapProxy implements org.tempuri.WebMerchant.MerchantService.MerchantServiceSoap {
  private String _endpoint = null;
  private org.tempuri.WebMerchant.MerchantService.MerchantServiceSoap merchantServiceSoap = null;
  
  public MerchantServiceSoapProxy() {
    _initMerchantServiceSoapProxy();
  }
  
  public MerchantServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initMerchantServiceSoapProxy();
  }
  
  private void _initMerchantServiceSoapProxy() {
    try {
      merchantServiceSoap = (new org.tempuri.WebMerchant.MerchantService.MerchantServiceLocator()).getMerchantServiceSoap();
      if (merchantServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)merchantServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)merchantServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (merchantServiceSoap != null)
      ((javax.xml.rpc.Stub)merchantServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebMerchant.MerchantService.MerchantServiceSoap getMerchantServiceSoap() {
    if (merchantServiceSoap == null)
      _initMerchantServiceSoapProxy();
    return merchantServiceSoap;
  }
  
  public java.lang.String makePayment(java.lang.String username, java.lang.String password, java.lang.String customerName, java.lang.String customerID, java.lang.String customerEmail, java.lang.String total, java.lang.String descriptionBuy, java.lang.String taxAmount1, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String zipcode, java.lang.String telephone, java.lang.String fax, java.lang.String ignoreValues, java.lang.String language, java.lang.String taxAmount2, java.lang.String taxAmount3, java.lang.String taxAmount4, java.lang.String taxAmount5, java.lang.String filler1, java.lang.String filler2, java.lang.String filler3) throws java.rmi.RemoteException{
    if (merchantServiceSoap == null)
      _initMerchantServiceSoapProxy();
    return merchantServiceSoap.makePayment(username, password, customerName, customerID, customerEmail, total, descriptionBuy, taxAmount1, address1, address2, city, zipcode, telephone, fax, ignoreValues, language, taxAmount2, taxAmount3, taxAmount4, taxAmount5, filler1, filler2, filler3);
  }
  
  public TransactionSearchResponse transactionSearch(TransactionSearchRequest transactionSearchRequest) throws java.rmi.RemoteException{
    if (merchantServiceSoap == null)
      _initMerchantServiceSoapProxy();
    return merchantServiceSoap.transactionSearch(transactionSearchRequest);
  }
  
  public ReverseTransaction.MMPay.Evertec.ReverseTransactionResponse reverseACHTransaction(ReverseTransaction.MMPay.Evertec.ReverseTransactionRequest reverseTransactionRequest) throws java.rmi.RemoteException{
    if (merchantServiceSoap == null)
      _initMerchantServiceSoapProxy();
    return merchantServiceSoap.reverseACHTransaction(reverseTransactionRequest);
  }
  
  public CardReverseTransaction.MMPay.Evertec.CardReverseTransactionResponse reverseCardTransaction(CardReverseTransaction.MMPay.Evertec.CardReverseTransactionRequest cardReverseTransactionRequest) throws java.rmi.RemoteException{
    if (merchantServiceSoap == null)
      _initMerchantServiceSoapProxy();
    return merchantServiceSoap.reverseCardTransaction(cardReverseTransactionRequest);
  }
  
  
}