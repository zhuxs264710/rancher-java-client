package io.rancher.type.kubernetes.cluster.node;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.NodePoolTransitioningEnum;
import io.rancher.type.OwnerReference;

public class NodePool extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String clusterId;
    
    private Boolean controlPlane;
    
    private String created;
    
    private String creatorId;
    
    private String displayName;
    
    private Boolean etcd;
    
    private String hostnamePrefix;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private String namespaceId;
    
    private Map<String, Object> nodeAnnotations;
    
    private Map<String, Object> nodeLabels;
    
    private String nodeTemplateId;
    
    private List<OwnerReference> ownerReferences;
    
    private Integer quantity;
    
    private String removed;
    
    private String state;
    
    private NodePoolStatus status;
    
    private NodePoolTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    private Boolean worker;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public Boolean getControlPlane() {
        return this.controlPlane;
    }

    public void setControlPlane(Boolean controlPlane) {
      this.controlPlane = controlPlane;
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
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    
    public Boolean getEtcd() {
        return this.etcd;
    }

    public void setEtcd(Boolean etcd) {
      this.etcd = etcd;
    }
    
    public String getHostnamePrefix() {
        return this.hostnamePrefix;
    }

    public void setHostnamePrefix(String hostnamePrefix) {
      this.hostnamePrefix = hostnamePrefix;
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
    
    public Map<String, Object> getNodeAnnotations() {
        return this.nodeAnnotations;
    }

    public void setNodeAnnotations(Map<String, Object> nodeAnnotations) {
      this.nodeAnnotations = nodeAnnotations;
    }
    
    public Map<String, Object> getNodeLabels() {
        return this.nodeLabels;
    }

    public void setNodeLabels(Map<String, Object> nodeLabels) {
      this.nodeLabels = nodeLabels;
    }
    
    public String getNodeTemplateId() {
        return this.nodeTemplateId;
    }

    public void setNodeTemplateId(String nodeTemplateId) {
      this.nodeTemplateId = nodeTemplateId;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
      this.quantity = quantity;
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
    
    public NodePoolStatus getStatus() {
        return this.status;
    }

    public void setStatus(NodePoolStatus status) {
      this.status = status;
    }
    
    public NodePoolTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(NodePoolTransitioningEnum transitioning) {
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
    
    public Boolean getWorker() {
        return this.worker;
    }

    public void setWorker(Boolean worker) {
      this.worker = worker;
    }
    
}
