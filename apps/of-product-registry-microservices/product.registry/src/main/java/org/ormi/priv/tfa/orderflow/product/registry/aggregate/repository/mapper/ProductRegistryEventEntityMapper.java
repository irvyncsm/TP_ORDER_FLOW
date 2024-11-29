package org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.ormi.priv.tfa.orderflow.lib.event.sourcing.aggregate.mapper.EventIdMapper;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event.ProductRegistered;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event.ProductRemoved;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event.ProductUpdated;
import org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model.ProductRegisteredEventEntity;
import org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model.ProductRemovedEventEntity;
import org.ormi.priv.tfa.orderflow.product.registry.aggregate.repository.model.ProductUpdatedEventEntity;

/**
 * Mapping interface used to convert between domain events and their entity
 * representations for persistence. This mapper handles events related to the
 * product registry, including the registration, updating, and removal of products.
 *
 * Uses MapStruct to perform automatic mappings and ensures that event payloads
 * and identifiers are properly converted.
 *
 * Dependencies:
 * - EventIdMapper: Handles conversion of event IDs to and from strings.
 * - ProductRegistryEventPayloadMapper: Contains specific mapping logic for event payloads.
 */
@Mapper(uses = {EventIdMapper.class, ProductRegistryEventPayloadMapper.class})
public interface ProductRegistryEventEntityMapper {

  /**
   * Singleton instance of the mapper for easy access.
   */
  ProductRegistryEventEntityMapper INSTANCE = Mappers.getMapper(ProductRegistryEventEntityMapper.class);

  // Mappings for ProductRegistered events

  /**
   * Converts a ProductRegistered domain event to its entity representation
   * for persistence.
   *
   * @param evt The product registration event to be mapped.
   * @return The corresponding entity representation.
   */
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "eventId", source = "id", qualifiedByName = "eventIdToString")
  @Mapping(target = "eventType", source = "eventType")
  @Mapping(target = "aggregateRootId", source = "aggregateId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productRegisteredEventPayloadToEntity")
  ProductRegisteredEventEntity toEntity(ProductRegistered evt);

  /**
   * Converts a ProductRegisteredEventEntity back to its domain event representation.
   *
   * @param entity The product registration event entity.
   * @return The corresponding domain event.
   */
  @Mapping(target = "id", source = "eventId", qualifiedByName = "toEventId")
  @Mapping(target = "eventType", ignore = true)
  @Mapping(target = "aggregateId", source = "aggregateRootId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productRegisteredEventPayloadToEvent")
  ProductRegistered toEvent(ProductRegisteredEventEntity entity);

  // Mappings for ProductUpdated events

  /**
   * Converts a ProductUpdated domain event to its entity representation
   * for persistence.
   *
   * @param evt The product update event to be mapped.
   * @return The corresponding entity representation.
   */
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "eventId", source = "id", qualifiedByName = "eventIdToString")
  @Mapping(target = "eventType", source = "eventType")
  @Mapping(target = "aggregateRootId", source = "aggregateId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productUpdatedEventEntityToEntity")
  ProductUpdatedEventEntity toEntity(ProductUpdated evt);

  /**
   * Converts a ProductUpdatedEventEntity back to its domain event representation.
   *
   * @param entity The product update event entity.
   * @return The corresponding domain event.
   */
  @Mapping(target = "id", source = "eventId", qualifiedByName = "toEventId")
  @Mapping(target = "eventType", ignore = true)
  @Mapping(target = "aggregateId", source = "aggregateRootId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productUpdatedEventPayloadToEvent")
  ProductUpdated toEvent(ProductUpdatedEventEntity entity);

  // Mappings for ProductRemoved events

  /**
   * Converts a ProductRemoved domain event to its entity representation
   * for persistence.
   *
   * @param evt The product removal event to be mapped.
   * @return The corresponding entity representation.
   */
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "eventId", source = "id", qualifiedByName = "eventIdToString")
  @Mapping(target = "eventType", source = "eventType")
  @Mapping(target = "aggregateRootId", source = "aggregateId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productRemovedEventPayloadToEntity")
  ProductRemovedEventEntity toEntity(ProductRemoved evt);

  /**
   * Converts a ProductRemovedEventEntity back to its domain event representation.
   *
   * @param entity The product removal event entity.
   * @return The corresponding domain event.
   */
  @Mapping(target = "id", source = "eventId", qualifiedByName = "toEventId")
  @Mapping(target = "eventType", ignore = true)
  @Mapping(target = "aggregateId", source = "aggregateRootId")
  @Mapping(target = "version", source = "version")
  @Mapping(target = "timestamp", source = "timestamp")
  @Mapping(target = "payload", source = "payload", qualifiedByName = "productRemovedEventPayloadToEvent")
  ProductRemoved toEvent(ProductRemovedEventEntity entity);
}
