package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.DynamicSchemaTransitioningEnum;

public class DynamicSchema extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private Map<String, Object> collectionActions;
    
    private Map<String, Object> collectionFields;
    
    private Map<String, Object> collectionFilters;
    
    private List<String> collectionMethods;
    
    private String created;
    
    private String creatorId;
    
    private Boolean embed;
    
    private String embedType;
    
    private List<String> includeableLinks;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String pluralName;
    
    private String removed;
    
    private Map<String, Object> resourceActions;
    
    private Map<String, Object> resourceFields;
    
    private List<String> resourceMethods;
    
    private String state;
    
    private DynamicSchemaStatus status;
    
    private DynamicSchemaTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Map<String, Object> getCollectionActions() {
        return this.collectionActions;
    }

    public void setCollectionActions(Map<String, Object> collectionActions) {
      this.collectionActions = collectionActions;
    }
    
    public Map<String, Object> getCollectionFields() {
        return this.collectionFields;
    }

    public void setCollectionFields(Map<String, Object> collectionFields) {
      this.collectionFields = collectionFields;
    }
    
    public Map<String, Object> getCollectionFilters() {
        return this.collectionFilters;
    }

    public void setCollectionFilters(Map<String, Object> collectionFilters) {
      this.collectionFilters = collectionFilters;
    }
    
    public List<String> getCollectionMethods() {
        return this.collectionMethods;
    }

    public void setCollectionMethods(List<String> collectionMethods) {
      this.collectionMethods = collectionMethods;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public Boolean getEmbed() {
        return this.embed;
    }

    public void setEmbed(Boolean embed) {
      this.embed = embed;
    }
    
    public String getEmbedType() {
        return this.embedType;
    }

    public void setEmbedType(String embedType) {
      this.embedType = embedType;
    }
    
    public List<String> getIncludeableLinks() {
        return this.includeableLinks;
    }

    public void setIncludeableLinks(List<String> includeableLinks) {
      this.includeableLinks = includeableLinks;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getPluralName() {
        return this.pluralName;
    }

    public void setPluralName(String pluralName) {
      this.pluralName = pluralName;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public Map<String, Object> getResourceActions() {
        return this.resourceActions;
    }

    public void setResourceActions(Map<String, Object> resourceActions) {
      this.resourceActions = resourceActions;
    }
    
    public Map<String, Object> getResourceFields() {
        return this.resourceFields;
    }

    public void setResourceFields(Map<String, Object> resourceFields) {
      this.resourceFields = resourceFields;
    }
    
    public List<String> getResourceMethods() {
        return this.resourceMethods;
    }

    public void setResourceMethods(List<String> resourceMethods) {
      this.resourceMethods = resourceMethods;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public DynamicSchemaStatus getStatus() {
        return this.status;
    }

    public void setStatus(DynamicSchemaStatus status) {
      this.status = status;
    }
    
    public DynamicSchemaTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(DynamicSchemaTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
