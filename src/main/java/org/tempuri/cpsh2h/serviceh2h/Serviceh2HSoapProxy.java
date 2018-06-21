package org.tempuri.cpsh2h.serviceh2h;

public class Serviceh2HSoapProxy implements org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoap {
  private String _endpoint = null;
  private org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoap serviceh2HSoap = null;
  
  public Serviceh2HSoapProxy() {
    _initServiceh2HSoapProxy();
  }
  
  public Serviceh2HSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceh2HSoapProxy();
  }
  
  private void _initServiceh2HSoapProxy() {
    try {
      serviceh2HSoap = (new org.tempuri.cpsh2h.serviceh2h.Serviceh2HLocator()).getserviceh2hSoap();
      if (serviceh2HSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceh2HSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceh2HSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceh2HSoap != null)
      ((javax.xml.rpc.Stub)serviceh2HSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoap getServiceh2HSoap() {
    if (serviceh2HSoap == null)
      _initServiceh2HSoapProxy();
    return serviceh2HSoap;
  }
  
  public org.tempuri.cpsh2h.serviceh2h.SendTransactionsResponseSendTransactionsResult sendTransactions(java.lang.String userName, java.lang.String passWord, java.lang.String customerID, java.lang.String customerName, java.lang.String customerEmail, java.lang.String telephone, java.lang.String fax, java.lang.String address1, java.lang.String address2, java.lang.String state, java.lang.String city, java.lang.String zipCode, java.lang.String descriptionBuy, java.lang.String operatorId, java.lang.String channel, java.lang.String tax1, java.lang.String tax2, java.lang.String tax3, java.lang.String tax4, java.lang.String merchantTransId, java.lang.String amount, java.lang.String paymentType, java.lang.String securityCardCode, java.lang.String expirationDate, java.lang.String cardNumber, java.lang.String bankRoutingNumber, java.lang.String bankAccountNumber, java.lang.String authorizationBit, java.lang.String bankClientName, java.lang.String filler1, java.lang.String filler2, java.lang.String filler3, java.lang.String filler4, java.lang.String note) throws java.rmi.RemoteException{
    if (serviceh2HSoap == null)
      _initServiceh2HSoapProxy();
    return serviceh2HSoap.sendTransactions(userName, passWord, customerID, customerName, customerEmail, telephone, fax, address1, address2, state, city, zipCode, descriptionBuy, operatorId, channel, tax1, tax2, tax3, tax4, merchantTransId, amount, paymentType, securityCardCode, expirationDate, cardNumber, bankRoutingNumber, bankAccountNumber, authorizationBit, bankClientName, filler1, filler2, filler3, filler4, note);
  }
  
  public org.tempuri.cpsh2h.serviceh2h.PinPadResponse requestPINPAD(java.lang.String userName, java.lang.String passWord, java.lang.String customerID, java.lang.String customerName, java.lang.String customerEmail, java.lang.String telephone, java.lang.String fax, java.lang.String address1, java.lang.String address2, java.lang.String state, java.lang.String city, java.lang.String zipCode, java.lang.String descriptionBuy, java.lang.String operatorId, java.lang.String channel, java.lang.String tax1, java.lang.String tax2, java.lang.String tax3, java.lang.String tax4, java.lang.String merchantTransId, java.lang.String amount, java.lang.String expirationDate, java.lang.String cardNumber, java.lang.String filler1, java.lang.String filler2, java.lang.String filler3, java.lang.String filler4, java.lang.String note) throws java.rmi.RemoteException{
    if (serviceh2HSoap == null)
      _initServiceh2HSoapProxy();
    return serviceh2HSoap.requestPINPAD(userName, passWord, customerID, customerName, customerEmail, telephone, fax, address1, address2, state, city, zipCode, descriptionBuy, operatorId, channel, tax1, tax2, tax3, tax4, merchantTransId, amount, expirationDate, cardNumber, filler1, filler2, filler3, filler4, note);
  }
  
  public org.tempuri.cpsh2h.serviceh2h.ATHResponse submitATH(java.lang.String userName, java.lang.String passWord, java.lang.String requestid) throws java.rmi.RemoteException{
    if (serviceh2HSoap == null)
      _initServiceh2HSoapProxy();
    return serviceh2HSoap.submitATH(userName, passWord, requestid);
  }
  
  
}