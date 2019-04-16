package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.DnsRecordTransitioningEnum;
import io.rancher.type.kubernetes.ServicePort;

public class DnsRecord extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String clusterIp;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private String hostname;
    
    private List<String> ipAddresses;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private List<ServicePort> ports;
    
    private String projectId;
    
    private List<PublicEndpoint> publicEndpoints;
    
    private String removed;
    
    private Map<String, Object> selector;
    
    private String state;
    
    private List<String> targetDnsRecordIds;
    
    private List<String> targetWorkloadIds;
    
    private DnsRecordTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    private String workloadId;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getClusterIp() {
        return this.clusterIp;
    }

    public void setClusterIp(String clusterIp) {
      this.clusterIp = clusterIp;
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
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
      this.ipAddresses = ipAddresses;
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
    
    public List<ServicePort> getPorts() {
        return this.ports;
    }

    public void setPorts(List<ServicePort> ports) {
      this.ports = ports;
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
    
    public Map<String, Object> getSelector() {
        return this.selector;
    }

    public void setSelector(Map<String, Object> selector) {
      this.selector = selector;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public List<String> getTargetDnsRecordIds() {
        return this.targetDnsRecordIds;
    }

    public void setTargetDnsRecordIds(List<String> targetDnsRecordIds) {
      this.targetDnsRecordIds = targetDnsRecordIds;
    }
    
    public List<String> getTargetWorkloadIds() {
        return this.targetWorkloadIds;
    }

    public void setTargetWorkloadIds(List<String> targetWorkloadIds) {
      this.targetWorkloadIds = targetWorkloadIds;
    }
    
    public DnsRecordTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(DnsRecordTransitioningEnum transitioning) {
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
    
    public String getWorkloadId() {
        return this.workloadId;
    }

    public void setWorkloadId(String workloadId) {
      this.workloadId = workloadId;
    }
    
}
