package io.rancher.type.kubernetes.ingress;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.IngressTransitioningEnum;
import io.rancher.type.OwnerReference;
import io.rancher.type.PublicEndpoint;

public class Ingress extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private IngressBackend defaultBackend;
    
    private String description;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private String projectId;
    
    private List<PublicEndpoint> publicEndpoints;
    
    private String removed;
    
    private List<IngressRule> rules;
    
    private String state;
    
    private IngressStatus status;
    
    private List<IngressTLS> tls;
    
    private IngressTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
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
    
    public IngressBackend getDefaultBackend() {
        return this.defaultBackend;
    }

    public void setDefaultBackend(IngressBackend defaultBackend) {
      this.defaultBackend = defaultBackend;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
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
    
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
      this.namespaceId = namespaceId;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public List<PublicEndpoint> getPublicEndpoints() {
        return this.publicEndpoints;
    }

    public void setPublicEndpoints(List<PublicEndpoint> publicEndpoints) {
      this.publicEndpoints = publicEndpoints;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public List<IngressRule> getRules() {
        return this.rules;
    }

    public void setRules(List<IngressRule> rules) {
      this.rules = rules;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public IngressStatus getStatus() {
        return this.status;
    }

    public void setStatus(IngressStatus status) {
      this.status = status;
    }
    
    public List<IngressTLS> getTls() {
        return this.tls;
    }

    public void setTls(List<IngressTLS> tls) {
      this.tls = tls;
    }
    
    public IngressTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(IngressTransitioningEnum transitioning) {
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
