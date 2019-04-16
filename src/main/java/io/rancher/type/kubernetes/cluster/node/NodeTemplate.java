package io.rancher.type.kubernetes.cluster.node;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.NodeTemplateTransitioningEnum;
import io.rancher.type.Digitaloceanconfig;
import io.rancher.type.OwnerReference;
import io.rancher.type.Vmwarevsphereconfig;
import io.rancher.type.cloudprovider.aws.Amazonec2config;
import io.rancher.type.cloudprovider.azure.Azureconfig;

public class NodeTemplate extends AbstractType {
    
    private Amazonec2config amazonec2Config;
    
    private Map<String, Object> annotations;
    
    private String authCertificateAuthority;
    
    private String authKey;
    
    private Azureconfig azureConfig;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private Digitaloceanconfig digitaloceanConfig;
    
    private String dockerVersion;
    
    private String driver;
    
    private Map<String, Object> engineEnv;
    
    private List<String> engineInsecureRegistry;
    
    private String engineInstallURL;
    
    private Map<String, Object> engineLabel;
    
    private Map<String, Object> engineOpt;
    
    private List<String> engineRegistryMirror;
    
    private String engineStorageDriver;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private String state;
    
    private NodeTemplateStatus status;
    
    private NodeTemplateTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private Boolean useInternalIpAddress;
    
    private String uuid;
    
    private Vmwarevsphereconfig vmwarevsphereConfig;
    
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
    
    public String getAuthCertificateAuthority() {
        return this.authCertificateAuthority;
    }

    public void setAuthCertificateAuthority(String authCertificateAuthority) {
      this.authCertificateAuthority = authCertificateAuthority;
    }
    
    public String getAuthKey() {
        return this.authKey;
    }

    public void setAuthKey(String authKey) {
      this.authKey = authKey;
    }
    
    public Azureconfig getAzureConfig() {
        return this.azureConfig;
    }

    public void setAzureConfig(Azureconfig azureConfig) {
      this.azureConfig = azureConfig;
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
    
    public Digitaloceanconfig getDigitaloceanConfig() {
        return this.digitaloceanConfig;
    }

    public void setDigitaloceanConfig(Digitaloceanconfig digitaloceanConfig) {
      this.digitaloceanConfig = digitaloceanConfig;
    }
    
    public String getDockerVersion() {
        return this.dockerVersion;
    }

    public void setDockerVersion(String dockerVersion) {
      this.dockerVersion = dockerVersion;
    }
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public Map<String, Object> getEngineEnv() {
        return this.engineEnv;
    }

    public void setEngineEnv(Map<String, Object> engineEnv) {
      this.engineEnv = engineEnv;
    }
    
    public List<String> getEngineInsecureRegistry() {
        return this.engineInsecureRegistry;
    }

    public void setEngineInsecureRegistry(List<String> engineInsecureRegistry) {
      this.engineInsecureRegistry = engineInsecureRegistry;
    }
    
    public String getEngineInstallURL() {
        return this.engineInstallURL;
    }

    public void setEngineInstallURL(String engineInstallURL) {
      this.engineInstallURL = engineInstallURL;
    }
    
    public Map<String, Object> getEngineLabel() {
        return this.engineLabel;
    }

    public void setEngineLabel(Map<String, Object> engineLabel) {
      this.engineLabel = engineLabel;
    }
    
    public Map<String, Object> getEngineOpt() {
        return this.engineOpt;
    }

    public void setEngineOpt(Map<String, Object> engineOpt) {
      this.engineOpt = engineOpt;
    }
    
    public List<String> getEngineRegistryMirror() {
        return this.engineRegistryMirror;
    }

    public void setEngineRegistryMirror(List<String> engineRegistryMirror) {
      this.engineRegistryMirror = engineRegistryMirror;
    }
    
    public String getEngineStorageDriver() {
        return this.engineStorageDriver;
    }

    public void setEngineStorageDriver(String engineStorageDriver) {
      this.engineStorageDriver = engineStorageDriver;
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
    
    public NodeTemplateStatus getStatus() {
        return this.status;
    }

    public void setStatus(NodeTemplateStatus status) {
      this.status = status;
    }
    
    public NodeTemplateTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(NodeTemplateTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Boolean getUseInternalIpAddress() {
        return this.useInternalIpAddress;
    }

    public void setUseInternalIpAddress(Boolean useInternalIpAddress) {
      this.useInternalIpAddress = useInternalIpAddress;
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
    
}
