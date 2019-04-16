package io.rancher.type.kubernetes.cluster;

import io.rancher.base.AbstractType;
import io.rancher.type.GoogleKubernetesEngineConfig;
import io.rancher.type.ImportedConfig;
import io.rancher.type.RancherKubernetesEngineConfig;
import io.rancher.type.cloudprovider.aws.AmazonElasticContainerServiceConfig;
import io.rancher.type.cloudprovider.azure.AzureKubernetesServiceConfig;

public class ClusterSpec extends AbstractType {
    
    private AmazonElasticContainerServiceConfig amazonElasticContainerServiceConfig;
    
    private AzureKubernetesServiceConfig azureKubernetesServiceConfig;
    
    private String defaultClusterRoleForProjectMembers;
    
    private String defaultPodSecurityPolicyTemplateId;
    
    private String description;
    
    private String desiredAgentImage;
    
    private String displayName;
    
    private String dockerRootDir;
    
    private Boolean enableNetworkPolicy;
    
    private GoogleKubernetesEngineConfig googleKubernetesEngineConfig;
    
    private ImportedConfig importedConfig;
    
    private Boolean internal;
    
    private RancherKubernetesEngineConfig rancherKubernetesEngineConfig;
    
    public AmazonElasticContainerServiceConfig getAmazonElasticContainerServiceConfig() {
        return this.amazonElasticContainerServiceConfig;
    }

    public void setAmazonElasticContainerServiceConfig(AmazonElasticContainerServiceConfig amazonElasticContainerServiceConfig) {
      this.amazonElasticContainerServiceConfig = amazonElasticContainerServiceConfig;
    }
    
    public AzureKubernetesServiceConfig getAzureKubernetesServiceConfig() {
        return this.azureKubernetesServiceConfig;
    }

    public void setAzureKubernetesServiceConfig(AzureKubernetesServiceConfig azureKubernetesServiceConfig) {
      this.azureKubernetesServiceConfig = azureKubernetesServiceConfig;
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
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    
    public String getDockerRootDir() {
        return this.dockerRootDir;
    }

    public void setDockerRootDir(String dockerRootDir) {
      this.dockerRootDir = dockerRootDir;
    }
    
    public Boolean getEnableNetworkPolicy() {
        return this.enableNetworkPolicy;
    }

    public void setEnableNetworkPolicy(Boolean enableNetworkPolicy) {
      this.enableNetworkPolicy = enableNetworkPolicy;
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
    
    public RancherKubernetesEngineConfig getRancherKubernetesEngineConfig() {
        return this.rancherKubernetesEngineConfig;
    }

    public void setRancherKubernetesEngineConfig(RancherKubernetesEngineConfig rancherKubernetesEngineConfig) {
      this.rancherKubernetesEngineConfig = rancherKubernetesEngineConfig;
    }
    
}
