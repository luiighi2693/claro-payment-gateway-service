package com.gateway.payments.ws.serviceh2h;

import java.io.Serializable;

public class EvertecResponse extends Throwable implements Serializable {
    private String statusCode;
    private String statusDescription;
    private String confirmationNumber;
    private String authorizationNumber;

    /* Propiedad del lado del Open API */
    private String transactionId;
    private String internalId;

    public EvertecResponse() {
    }

    public EvertecResponse(String statusCode, String statusDescription, String confirmationNumber, String authorizationNumber, String transactionId, String internalId) {
        this.statusCode = statusCode;
        this.statusDescription = statusDescription;
        this.confirmationNumber = confirmationNumber;
        this.authorizationNumber = authorizationNumber;
        this.transactionId = transactionId;
        this.internalId = internalId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getAuthorizationNumber() {
        return authorizationNumber;
    }

    public void setAuthorizationNumber(String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getInternalId() {
        return internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }
}
