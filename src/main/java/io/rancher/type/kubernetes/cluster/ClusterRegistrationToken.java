package io.rancher.type.kubernetes.cluster;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.ClusterRegistrationTokenTransitioningEnum;
import io.rancher.type.OwnerReference;

public class ClusterRegistrationToken extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String clusterId;
    
    private String command;
    
    private String created;
    
    private String creatorId;
    
    private String insecureCommand;
    
    private Map<String, Object> labels;
    
    private String manifestUrl;
    
    private String name;
    
    private String namespaceId;
    
    private String nodeCommand;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private String state;
    
    private String token;
    
    private ClusterRegistrationTokenTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    private String windowsNodeCommand;
    
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
    
    public String getCommand() {
        return this.command;
    }

    public void setCommand(String command) {
      this.command = command;
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
    
    public String getInsecureCommand() {
        return this.insecureCommand;
    }

    public void setInsecureCommand(String insecureCommand) {
      this.insecureCommand = insecureCommand;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getManifestUrl() {
        return this.manifestUrl;
    }

    public void setManifestUrl(String manifestUrl) {
      this.manifestUrl = manifestUrl;
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
    
    public String getNodeCommand() {
        return this.nodeCommand;
    }

    public void setNodeCommand(String nodeCommand) {
      this.nodeCommand = nodeCommand;
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
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
    }
    
    public ClusterRegistrationTokenTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(ClusterRegistrationTokenTransitioningEnum transitioning) {
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
    
    public String getWindowsNodeCommand() {
        return this.windowsNodeCommand;
    }

    public void setWindowsNodeCommand(String windowsNodeCommand) {
      this.windowsNodeCommand = windowsNodeCommand;
    }
    
}
