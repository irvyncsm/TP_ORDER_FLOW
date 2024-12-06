package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model;

public class ProductRegisteredEventEntity extends ProductRegistryEventEntity {
  static final String EVENT_TYPE = "ProductRegistered";

  /**
   * Payload for the event.
   *
   * @param productId The id of the product.
   * @param name The name of the product.
   * @param productDescription The description of the product.
   */
  public static record Payload(String productId, String name, String productDescription) {
  }

  /**
   * The payload for the event.
   */
  private Payload payload;

  public Payload getPayload() {
    return payload;
  }

  @Override
  public String getEventType() {
    return EVENT_TYPE;
  }
}