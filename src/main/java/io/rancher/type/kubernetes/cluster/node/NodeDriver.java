package io.rancher.type.kubernetes.cluster.node;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.NodeDriverTransitioningEnum;
import io.rancher.type.OwnerReference;

public class NodeDriver extends AbstractType {
    
    private Boolean active;
    
    private Map<String, Object> annotations;
    
    private Boolean builtin;
    
    private String checksum;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private String externalId;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private String state;
    
    private NodeDriverStatus status;
    
    private String transitioning;
    
    private NodeDriverTransitioningEnum transitioningMessage;
    
    private String uiUrl;
    
    private String url;
    
    private String uuid;
    
    private List<String> whitelistDomains;
    
    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
      this.active = active;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Boolean getBuiltin() {
        return this.builtin;
    }

    public void setBuiltin(Boolean builtin) {
      this.builtin = builtin;
    }
    
    public String getChecksum() {
        return this.checksum;
    }

    public void setChecksum(String checksum) {
      this.checksum = checksum;
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
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
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
    
    public NodeDriverStatus getStatus() {
        return this.status;
    }

    public void setStatus(NodeDriverStatus status) {
      this.status = status;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public NodeDriverTransitioningEnum getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(NodeDriverTransitioningEnum transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUiUrl() {
        return this.uiUrl;
    }

    public void setUiUrl(String uiUrl) {
      this.uiUrl = uiUrl;
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
    
    public List<String> getWhitelistDomains() {
        return this.whitelistDomains;
    }

    public void setWhitelistDomains(List<String> whitelistDomains) {
      this.whitelistDomains = whitelistDomains;
    }
    
}
