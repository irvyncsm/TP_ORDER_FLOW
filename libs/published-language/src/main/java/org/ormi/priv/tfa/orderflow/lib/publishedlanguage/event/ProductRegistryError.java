package org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
public final class ProductRegistryError implements ChannelMessage {
    private String message;

    public ProductRegistryError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}