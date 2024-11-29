package org.ormi.priv.tfa.orderflow.api.gateway.productregistry.adapter.inbound.http.resource.exception;

public class ProductRegistryConsumerCreationException extends Exception {
    public ProductRegistryConsumerCreationException(String message) {
        super(message);
    }

    public ProductRegistryConsumerCreationException(String message, Throwable cause) {
        super(message, cause);
    }
}
