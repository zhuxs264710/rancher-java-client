package io.rancher.type.github;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.GithubConfigAccessModeEnum;
import io.rancher.type.OwnerReference;

public class GithubConfig extends AbstractType {
    
    private GithubConfigAccessModeEnum accessMode;
    
    private List<String> allowedPrincipalIds;
    
    private Map<String, Object> annotations;
    
    private String clientId;
    
    private String clientSecret;
    
    private String created;
    
    private String creatorId;
    
    private Boolean enabled;
    
    private String hostname;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private Boolean tls;
    
    private String type;
    
    private String uuid;
    
    public GithubConfigAccessModeEnum getAccessMode() {
        return this.accessMode;
    }

    public void setAccessMode(GithubConfigAccessModeEnum accessMode) {
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
    
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
      this.clientId = clientId;
    }
    
    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
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
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
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
    
    public Boolean getTls() {
        return this.tls;
    }

    public void setTls(Boolean tls) {
      this.tls = tls;
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
