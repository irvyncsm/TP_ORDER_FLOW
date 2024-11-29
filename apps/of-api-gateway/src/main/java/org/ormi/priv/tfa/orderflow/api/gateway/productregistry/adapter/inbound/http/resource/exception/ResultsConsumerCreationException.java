package org.ormi.priv.tfa.orderflow.api.gateway.productregistry.adapter.inbound.http.resource.exception;

public class ResultsConsumerCreationException extends Exception {
    public ResultsConsumerCreationException(String message) {
        super(message);
    }

    public ResultsConsumerCreationException(String message, Throwable cause) {
        super(message, cause);
    }
}
