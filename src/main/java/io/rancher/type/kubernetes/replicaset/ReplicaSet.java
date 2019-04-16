package io.rancher.type.kubernetes.replicaset;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.ReplicaSetTransitioningEnum;
import io.rancher.type.LabelSelector;
import io.rancher.type.LocalObjectReference;
import io.rancher.type.OwnerReference;
import io.rancher.type.PublicEndpoint;
import io.rancher.type.Scheduling;
import io.rancher.type.docker.container.Container;
import io.rancher.type.kubernetes.HostAlias;
import io.rancher.type.kubernetes.pod.PodDNSConfig;
import io.rancher.type.kubernetes.volumes.Volume;

public class ReplicaSet extends AbstractType {
    
    private Integer activeDeadlineSeconds;
    
    private Map<String, Object> annotations;
    
    private Boolean automountServiceAccountToken;
    
    private List<Container> containers;
    
    private String created;
    
    private String creatorId;
    
    private PodDNSConfig dnsConfig;
    
    private String dnsPolicy;
    
    private Integer fsgid;
    
    private List<Integer> gids;
    
    private List<HostAlias> hostAliases;
    
    private Boolean hostIPC;
    
    private Boolean hostNetwork;
    
    private Boolean hostPID;
    
    private String hostname;
    
    private List<LocalObjectReference> imagePullSecrets;
    
    private Map<String, Object> labels;
    /**
     * DnsLabelRestricted
     */
    private String name;
    
    private String namespaceId;
    
    private String nodeId;
    
    private List<OwnerReference> ownerReferences;
    
    private Integer priority;
    
    private String priorityClassName;
    
    private String projectId;
    
    private List<PublicEndpoint> publicEndpoints;
    
    private String removed;
    
    private ReplicaSetConfig replicaSetConfig;
    
    private ReplicaSetStatus replicaSetStatus;
    
    private String restartPolicy;
    
    private Integer runAsGroup;
    
    private Boolean runAsNonRoot;
    
    private Integer scale;
    
    private String schedulerName;
    
    private Scheduling scheduling;
    
    private LabelSelector selector;
    
    private String serviceAccountName;
    
    private Boolean shareProcessNamespace;
    
    private String state;
    
    private String subdomain;
    
    private Integer terminationGracePeriodSeconds;
    
    private ReplicaSetTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private Integer uid;
    
    private String uuid;
    
    private List<Volume> volumes;
    
    private Map<String, Object> workloadAnnotations;
    
    private Map<String, Object> workloadLabels;
    
    public Integer getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
      this.activeDeadlineSeconds = activeDeadlineSeconds;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Boolean getAutomountServiceAccountToken() {
        return this.automountServiceAccountToken;
    }

    public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
      this.automountServiceAccountToken = automountServiceAccountToken;
    }
    
    public List<Container> getContainers() {
        return this.containers;
    }

    public void setContainers(List<Container> containers) {
      this.containers = containers;
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
    
    public PodDNSConfig getDnsConfig() {
        return this.dnsConfig;
    }

    public void setDnsConfig(PodDNSConfig dnsConfig) {
      this.dnsConfig = dnsConfig;
    }
    
    public String getDnsPolicy() {
        return this.dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
      this.dnsPolicy = dnsPolicy;
    }
    
    public Integer getFsgid() {
        return this.fsgid;
    }

    public void setFsgid(Integer fsgid) {
      this.fsgid = fsgid;
    }
    
    public List<Integer> getGids() {
        return this.gids;
    }

    public void setGids(List<Integer> gids) {
      this.gids = gids;
    }
    
    public List<HostAlias> getHostAliases() {
        return this.hostAliases;
    }

    public void setHostAliases(List<HostAlias> hostAliases) {
      this.hostAliases = hostAliases;
    }
    
    public Boolean getHostIPC() {
        return this.hostIPC;
    }

    public void setHostIPC(Boolean hostIPC) {
      this.hostIPC = hostIPC;
    }
    
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
      this.hostNetwork = hostNetwork;
    }
    
    public Boolean getHostPID() {
        return this.hostPID;
    }

    public void setHostPID(Boolean hostPID) {
      this.hostPID = hostPID;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public List<LocalObjectReference> getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    public void setImagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
      this.imagePullSecrets = imagePullSecrets;
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
    
    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
      this.nodeId = nodeId;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
      this.priority = priority;
    }
    
    public String getPriorityClassName() {
        return this.priorityClassName;
    }

    public void setPriorityClassName(String priorityClassName) {
      this.priorityClassName = priorityClassName;
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
    
    public ReplicaSetConfig getReplicaSetConfig() {
        return this.replicaSetConfig;
    }

    public void setReplicaSetConfig(ReplicaSetConfig replicaSetConfig) {
      this.replicaSetConfig = replicaSetConfig;
    }
    
    public ReplicaSetStatus getReplicaSetStatus() {
        return this.replicaSetStatus;
    }

    public void setReplicaSetStatus(ReplicaSetStatus replicaSetStatus) {
      this.replicaSetStatus = replicaSetStatus;
    }
    
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
      this.restartPolicy = restartPolicy;
    }
    
    public Integer getRunAsGroup() {
        return this.runAsGroup;
    }

    public void setRunAsGroup(Integer runAsGroup) {
      this.runAsGroup = runAsGroup;
    }
    
    public Boolean getRunAsNonRoot() {
        return this.runAsNonRoot;
    }

    public void setRunAsNonRoot(Boolean runAsNonRoot) {
      this.runAsNonRoot = runAsNonRoot;
    }
    
    public Integer getScale() {
        return this.scale;
    }

    public void setScale(Integer scale) {
      this.scale = scale;
    }
    
    public String getSchedulerName() {
        return this.schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
      this.schedulerName = schedulerName;
    }
    
    public Scheduling getScheduling() {
        return this.scheduling;
    }

    public void setScheduling(Scheduling scheduling) {
      this.scheduling = scheduling;
    }
    
    public LabelSelector getSelector() {
        return this.selector;
    }

    public void setSelector(LabelSelector selector) {
      this.selector = selector;
    }
    
    public String getServiceAccountName() {
        return this.serviceAccountName;
    }

    public void setServiceAccountName(String serviceAccountName) {
      this.serviceAccountName = serviceAccountName;
    }
    
    public Boolean getShareProcessNamespace() {
        return this.shareProcessNamespace;
    }

    public void setShareProcessNamespace(Boolean shareProcessNamespace) {
      this.shareProcessNamespace = shareProcessNamespace;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getSubdomain() {
        return this.subdomain;
    }

    public void setSubdomain(String subdomain) {
      this.subdomain = subdomain;
    }
    
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
      this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }
    
    public ReplicaSetTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(ReplicaSetTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
      this.uid = uid;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public List<Volume> getVolumes() {
        return this.volumes;
    }

    public void setVolumes(List<Volume> volumes) {
      this.volumes = volumes;
    }
    
    public Map<String, Object> getWorkloadAnnotations() {
        return this.workloadAnnotations;
    }

    public void setWorkloadAnnotations(Map<String, Object> workloadAnnotations) {
      this.workloadAnnotations = workloadAnnotations;
    }
    
    public Map<String, Object> getWorkloadLabels() {
        return this.workloadLabels;
    }

    public void setWorkloadLabels(Map<String, Object> workloadLabels) {
      this.workloadLabels = workloadLabels;
    }
    
}
