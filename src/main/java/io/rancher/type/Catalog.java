package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.CatalogTransitioningEnum;

public class Catalog extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String branch;
    
    private String commit;
    
    private List<CatalogCondition> conditions;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private String kind;
    
    private Map<String, Object> labels;
    
    private String lastRefreshTimestamp;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private String state;
    
    private CatalogTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String url;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
      this.branch = branch;
    }
    
    public String getCommit() {
        return this.commit;
    }

    public void setCommit(String commit) {
      this.commit = commit;
    }
    
    public List<CatalogCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<CatalogCondition> conditions) {
      this.conditions = conditions;
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLastRefreshTimestamp() {
        return this.lastRefreshTimestamp;
    }

    public void setLastRefreshTimestamp(String lastRefreshTimestamp) {
      this.lastRefreshTimestamp = lastRefreshTimestamp;
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
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public CatalogTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(CatalogTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
