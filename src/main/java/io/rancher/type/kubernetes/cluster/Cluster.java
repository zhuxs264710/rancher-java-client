package io.rancher.type.kubernetes.cluster;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.ClusterTransitioningEnum;
import io.rancher.type.GoogleKubernetesEngineConfig;
import io.rancher.type.ImportedConfig;
import io.rancher.type.Info;
import io.rancher.type.OwnerReference;
import io.rancher.type.RancherKubernetesEngineConfig;
import io.rancher.type.cloudprovider.aws.AmazonElasticContainerServiceConfig;
import io.rancher.type.cloudprovider.azure.AzureKubernetesServiceConfig;

public class Cluster extends AbstractType {
    
    private String agentImage;
    
    private Map<String, Object> allocatable;
    
    private AmazonElasticContainerServiceConfig amazonElasticContainerServiceConfig;
    
    private Map<String, Object> annotations;
    
    private String apiEndpoint;
    
    private Boolean appliedEnableNetworkPolicy;
    
    private String appliedPodSecurityPolicyTemplateId;
    
    private ClusterSpec appliedSpec;
    
    private AzureKubernetesServiceConfig azureKubernetesServiceConfig;
    
    private String caCert;
    
    private Map<String, Object> capacity;
    
    private List<ClusterComponentStatus> componentStatuses;
    
    private List<ClusterCondition> conditions;
    
    private String created;
    
    private String creatorId;
    
    private String defaultClusterRoleForProjectMembers;
    
    private String defaultPodSecurityPolicyTemplateId;
    
    private String description;
    
    private String desiredAgentImage;
    
    private String dockerRootDir;
    
    private String driver;
    
    private Boolean enableNetworkPolicy;
    
    private ClusterSpec failedSpec;
    
    private GoogleKubernetesEngineConfig googleKubernetesEngineConfig;
    
    private ImportedConfig importedConfig;
    
    private Boolean internal;
    
    private Map<String, Object> labels;
    
    private Map<String, Object> limits;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private RancherKubernetesEngineConfig rancherKubernetesEngineConfig;
    
    private String removed;
    
    private Map<String, Object> requested;
    
    private String state;
    
    private ClusterTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    private Info version;
    
    public String getAgentImage() {
        return this.agentImage;
    }

    public void setAgentImage(String agentImage) {
      this.agentImage = agentImage;
    }
    
    public Map<String, Object> getAllocatable() {
        return this.allocatable;
    }

    public void setAllocatable(Map<String, Object> allocatable) {
      this.allocatable = allocatable;
    }
    
    public AmazonElasticContainerServiceConfig getAmazonElasticContainerServiceConfig() {
        return this.amazonElasticContainerServiceConfig;
    }

    public void setAmazonElasticContainerServiceConfig(AmazonElasticContainerServiceConfig amazonElasticContainerServiceConfig) {
      this.amazonElasticContainerServiceConfig = amazonElasticContainerServiceConfig;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getApiEndpoint() {
        return this.apiEndpoint;
    }

    public void setApiEndpoint(String apiEndpoint) {
      this.apiEndpoint = apiEndpoint;
    }
    
    public Boolean getAppliedEnableNetworkPolicy() {
        return this.appliedEnableNetworkPolicy;
    }

    public void setAppliedEnableNetworkPolicy(Boolean appliedEnableNetworkPolicy) {
      this.appliedEnableNetworkPolicy = appliedEnableNetworkPolicy;
    }
    
    public String getAppliedPodSecurityPolicyTemplateId() {
        return this.appliedPodSecurityPolicyTemplateId;
    }

    public void setAppliedPodSecurityPolicyTemplateId(String appliedPodSecurityPolicyTemplateId) {
      this.appliedPodSecurityPolicyTemplateId = appliedPodSecurityPolicyTemplateId;
    }
    
    public ClusterSpec getAppliedSpec() {
        return this.appliedSpec;
    }

    public void setAppliedSpec(ClusterSpec appliedSpec) {
      this.appliedSpec = appliedSpec;
    }
    
    public AzureKubernetesServiceConfig getAzureKubernetesServiceConfig() {
        return this.azureKubernetesServiceConfig;
    }

    public void setAzureKubernetesServiceConfig(AzureKubernetesServiceConfig azureKubernetesServiceConfig) {
      this.azureKubernetesServiceConfig = azureKubernetesServiceConfig;
    }
    
    public String getCaCert() {
        return this.caCert;
    }

    public void setCaCert(String caCert) {
      this.caCert = caCert;
    }
    
    public Map<String, Object> getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Map<String, Object> capacity) {
      this.capacity = capacity;
    }
    
    public List<ClusterComponentStatus> getComponentStatuses() {
        return this.componentStatuses;
    }

    public void setComponentStatuses(List<ClusterComponentStatus> componentStatuses) {
      this.componentStatuses = componentStatuses;
    }
    
    public List<ClusterCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<ClusterCondition> conditions) {
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
    
    public String getDefaultClusterRoleForProjectMembers() {
        return this.defaultClusterRoleForProjectMembers;
    }

    public void setDefaultClusterRoleForProjectMembers(String defaultClusterRoleForProjectMembers) {
      this.defaultClusterRoleForProjectMembers = defaultClusterRoleForProjectMembers;
    }
    
    public String getDefaultPodSecurityPolicyTemplateId() {
        return this.defaultPodSecurityPolicyTemplateId;
    }

    public void setDefaultPodSecurityPolicyTemplateId(String defaultPodSecurityPolicyTemplateId) {
      this.defaultPodSecurityPolicyTemplateId = defaultPodSecurityPolicyTemplateId;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getDesiredAgentImage() {
        return this.desiredAgentImage;
    }

    public void setDesiredAgentImage(String desiredAgentImage) {
      this.desiredAgentImage = desiredAgentImage;
    }
    
    public String getDockerRootDir() {
        return this.dockerRootDir;
    }

    public void setDockerRootDir(String dockerRootDir) {
      this.dockerRootDir = dockerRootDir;
    }
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public Boolean getEnableNetworkPolicy() {
        return this.enableNetworkPolicy;
    }

    public void setEnableNetworkPolicy(Boolean enableNetworkPolicy) {
      this.enableNetworkPolicy = enableNetworkPolicy;
    }
    
    public ClusterSpec getFailedSpec() {
        return this.failedSpec;
    }

    public void setFailedSpec(ClusterSpec failedSpec) {
      this.failedSpec = failedSpec;
    }
    
    public GoogleKubernetesEngineConfig getGoogleKubernetesEngineConfig() {
        return this.googleKubernetesEngineConfig;
    }

    public void setGoogleKubernetesEngineConfig(GoogleKubernetesEngineConfig googleKubernetesEngineConfig) {
      this.googleKubernetesEngineConfig = googleKubernetesEngineConfig;
    }
    
    public ImportedConfig getImportedConfig() {
        return this.importedConfig;
    }

    public void setImportedConfig(ImportedConfig importedConfig) {
      this.importedConfig = importedConfig;
    }
    
    public Boolean getInternal() {
        return this.internal;
    }

    public void setInternal(Boolean internal) {
      this.internal = internal;
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
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public RancherKubernetesEngineConfig getRancherKubernetesEngineConfig() {
        return this.rancherKubernetesEngineConfig;
    }

    public void setRancherKubernetesEngineConfig(RancherKubernetesEngineConfig rancherKubernetesEngineConfig) {
      this.rancherKubernetesEngineConfig = rancherKubernetesEngineConfig;
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
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public ClusterTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(ClusterTransitioningEnum transitioning) {
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
    
    public Info getVersion() {
        return this.version;
    }

    public void setVersion(Info version) {
      this.version = version;
    }
    
}
