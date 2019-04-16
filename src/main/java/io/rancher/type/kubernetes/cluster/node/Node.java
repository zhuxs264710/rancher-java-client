package io.rancher.type.kubernetes.cluster.node;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.NodeTransitioningEnum;
import io.rancher.type.CustomConfig;
import io.rancher.type.Digitaloceanconfig;
import io.rancher.type.OwnerReference;
import io.rancher.type.PublicEndpoint;
import io.rancher.type.Taint;
import io.rancher.type.Vmwarevsphereconfig;
import io.rancher.type.cloudprovider.aws.Amazonec2config;
import io.rancher.type.cloudprovider.azure.Azureconfig;
import io.rancher.type.docker.DockerInfo;

public class Node extends AbstractType {
    
    private Map<String, Object> allocatable;
    
    private Amazonec2config amazonec2Config;
    
    private Map<String, Object> annotations;
    
    private Azureconfig azureConfig;
    
    private Map<String, Object> capacity;
    
    private String clusterId;
    
    private List<NodeCondition> conditions;
    
    private Boolean controlPlane;
    
    private String created;
    
    private String creatorId;
    
    private CustomConfig customConfig;
    
    private String description;
    
    private Digitaloceanconfig digitaloceanConfig;
    
    private DockerInfo dockerInfo;
    
    private Boolean etcd;
    
    private String externalIpAddress;
    
    private String String;
    
    private Boolean imported;
    
    private NodeInfo info;
    
    private String ipAddress;
    
    private Map<String, Object> labels;
    
    private Map<String, Object> limits;
    
    private String name;
    
    private String namespaceId;
    
    private String nodeName;
    
    private String nodePoolId;
    
    private List<Taint> nodeTaints;
    
    private String nodeTemplateId;
    
    private List<OwnerReference> ownerReferences;
    
    private String podCidr;
    
    private String providerId;
    
    private List<PublicEndpoint> publicEndpoints;
    
    private String removed;
    
    private Map<String, Object> requested;
    
    private String requestedString;
    
    private String sshUser;
    
    private String state;
    
    private List<Taint> taints;
    
    private NodeTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private Boolean unschedulable;
    
    private String uuid;
    
    private Vmwarevsphereconfig vmwarevsphereConfig;
    
    private Map<String, Object> volumesAttached;
    
    private List<String> volumesInUse;
    
    private Boolean worker;
    
    public Map<String, Object> getAllocatable() {
        return this.allocatable;
    }

    public void setAllocatable(Map<String, Object> allocatable) {
      this.allocatable = allocatable;
    }
    
    public Amazonec2config getAmazonec2Config() {
        return this.amazonec2Config;
    }

    public void setAmazonec2Config(Amazonec2config amazonec2Config) {
      this.amazonec2Config = amazonec2Config;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Azureconfig getAzureConfig() {
        return this.azureConfig;
    }

    public void setAzureConfig(Azureconfig azureConfig) {
      this.azureConfig = azureConfig;
    }
    
    public Map<String, Object> getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Map<String, Object> capacity) {
      this.capacity = capacity;
    }
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public List<NodeCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<NodeCondition> conditions) {
      this.conditions = conditions;
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
    
    public CustomConfig getCustomConfig() {
        return this.customConfig;
    }

    public void setCustomConfig(CustomConfig customConfig) {
      this.customConfig = customConfig;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Digitaloceanconfig getDigitaloceanConfig() {
        return this.digitaloceanConfig;
    }

    public void setDigitaloceanConfig(Digitaloceanconfig digitaloceanConfig) {
      this.digitaloceanConfig = digitaloceanConfig;
    }
    
    public DockerInfo getDockerInfo() {
        return this.dockerInfo;
    }

    public void setDockerInfo(DockerInfo dockerInfo) {
      this.dockerInfo = dockerInfo;
    }
    
    public Boolean getEtcd() {
        return this.etcd;
    }

    public void setEtcd(Boolean etcd) {
      this.etcd = etcd;
    }
    
    public String getExternalIpAddress() {
        return this.externalIpAddress;
    }

    public void setExternalIpAddress(String externalIpAddress) {
      this.externalIpAddress = externalIpAddress;
    }
    
    public String getString() {
        return this.String;
    }

    public void setString(String String) {
      this.String = String;
    }
    
    public Boolean getImported() {
        return this.imported;
    }

    public void setImported(Boolean imported) {
      this.imported = imported;
    }
    
    public NodeInfo getInfo() {
        return this.info;
    }

    public void setInfo(NodeInfo info) {
      this.info = info;
    }
    
    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Map<String, Object> getLimits() {
        return this.limits;
    }

    public void setLimits(Map<String, Object> limits) {
      this.limits = limits;
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
    
    public String getNodeName() {
        return this.nodeName;
    }

    public void setNodeName(String nodeName) {
      this.nodeName = nodeName;
    }
    
    public String getNodePoolId() {
        return this.nodePoolId;
    }

    public void setNodePoolId(String nodePoolId) {
      this.nodePoolId = nodePoolId;
    }
    
    public List<Taint> getNodeTaints() {
        return this.nodeTaints;
    }

    public void setNodeTaints(List<Taint> nodeTaints) {
      this.nodeTaints = nodeTaints;
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
    
    public String getPodCidr() {
        return this.podCidr;
    }

    public void setPodCidr(String podCidr) {
      this.podCidr = podCidr;
    }
    
    public String getProviderId() {
        return this.providerId;
    }

    public void setProviderId(String providerId) {
      this.providerId = providerId;
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
    
    public Map<String, Object> getRequested() {
        return this.requested;
    }

    public void setRequested(Map<String, Object> requested) {
      this.requested = requested;
    }
    
    public String getRequestedString() {
        return this.requestedString;
    }

    public void setRequestedString(String requestedString) {
      this.requestedString = requestedString;
    }
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public List<Taint> getTaints() {
        return this.taints;
    }

    public void setTaints(List<Taint> taints) {
      this.taints = taints;
    }
    
    public NodeTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(NodeTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Boolean getUnschedulable() {
        return this.unschedulable;
    }

    public void setUnschedulable(Boolean unschedulable) {
      this.unschedulable = unschedulable;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Vmwarevsphereconfig getVmwarevsphereConfig() {
        return this.vmwarevsphereConfig;
    }

    public void setVmwarevsphereConfig(Vmwarevsphereconfig vmwarevsphereConfig) {
      this.vmwarevsphereConfig = vmwarevsphereConfig;
    }
    
    public Map<String, Object> getVolumesAttached() {
        return this.volumesAttached;
    }

    public void setVolumesAttached(Map<String, Object> volumesAttached) {
      this.volumesAttached = volumesAttached;
    }
    
    public List<String> getVolumesInUse() {
        return this.volumesInUse;
    }

    public void setVolumesInUse(List<String> volumesInUse) {
      this.volumesInUse = volumesInUse;
    }
    
    public Boolean getWorker() {
        return this.worker;
    }

    public void setWorker(Boolean worker) {
      this.worker = worker;
    }
    
}
