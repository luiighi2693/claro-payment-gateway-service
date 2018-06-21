
package com.gateway.payments.domain;

/**
 *
 * @author jmercado
 */
public class TransactionRequest {
    
    private String transactionId;

    /**
     * Get the value of transactionId
     *
     * @return the value of transactionId
     */
    public String getTransactionId() {
    	
        return transactionId;
    }

    /**
     * Set the value of transactionId
     *
     * @param transactionId new value of transactionId
     */
    public void setTransactionId(String transactionId) {
    	
        this.transactionId = transactionId;
    }

    private String aplicationId;

    /**
     * Get the value of aplicationId
     *
     * @return the value of aplicationId
     */
    public String getAplicationId() {
    	
        return aplicationId;
    }

    /**
     * Set the value of aplicationId
     *
     * @param aplicationId new value of aplicationId
     */
    public void setAplicationId(String aplicationId) {
    	
        this.aplicationId = aplicationId;
    }

}
