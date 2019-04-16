package io.rancher.type.cloudprovider.azure;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.AzureADConfigAccessModeEnum;
import io.rancher.type.OwnerReference;

public class AzureADConfig extends AbstractType {
    
    private AzureADConfigAccessModeEnum accessMode;
    
    private List<String> allowedPrincipalIds;
    
    private Map<String, Object> annotations;
    
    private String applicationId;
    
    private String applicationSecret;
    
    private String authEndpoint;
    
    private String created;
    
    private String creatorId;
    
    private Boolean enabled;
    
    private String endpoint;
    
    private String graphEndpoint;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String rancherUrl;
    
    private String removed;
    
    private String tenantId;
    
    private String tokenEndpoint;
    
    private String type;
    
    private String uuid;
    
    public AzureADConfigAccessModeEnum getAccessMode() {
        return this.accessMode;
    }

    public void setAccessMode(AzureADConfigAccessModeEnum accessMode) {
      this.accessMode = accessMode;
    }
    
    public List<String> getAllowedPrincipalIds() {
        return this.allowedPrincipalIds;
    }

    public void setAllowedPrincipalIds(List<String> allowedPrincipalIds) {
      this.allowedPrincipalIds = allowedPrincipalIds;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
      this.applicationId = applicationId;
    }
    
    public String getApplicationSecret() {
        return this.applicationSecret;
    }

    public void setApplicationSecret(String applicationSecret) {
      this.applicationSecret = applicationSecret;
    }
    
    public String getAuthEndpoint() {
        return this.authEndpoint;
    }

    public void setAuthEndpoint(String authEndpoint) {
      this.authEndpoint = authEndpoint;
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
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getGraphEndpoint() {
        return this.graphEndpoint;
    }

    public void setGraphEndpoint(String graphEndpoint) {
      this.graphEndpoint = graphEndpoint;
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
    
    public String getRancherUrl() {
        return this.rancherUrl;
    }

    public void setRancherUrl(String rancherUrl) {
      this.rancherUrl = rancherUrl;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
    }
    
    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    public void setTokenEndpoint(String tokenEndpoint) {
      this.tokenEndpoint = tokenEndpoint;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
