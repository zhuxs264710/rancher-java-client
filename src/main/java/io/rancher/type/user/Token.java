package io.rancher.type.user;

import io.rancher.base.AbstractType;
import io.rancher.type.OwnerReference;

import java.util.List;
import java.util.Map;

public class Token extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String authProvider;
    
    private String created;
    
    private String creatorId;
    
    private Boolean current;
    
    private String description;
    
    private Boolean expired;
    
    private String expiresAt;
    
    private List<String> groupPrincipals;
    
    private Boolean isDerived;
    
    private Map<String, Object> labels;
    
    private String lastUpdateTime;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private Map<String, Object> providerInfo;
    
    private String removed;
    
    private String token;
    
    private Integer ttl;
    
    private String userId;
    
    private String userPrincipal;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getAuthProvider() {
        return this.authProvider;
    }

    public void setAuthProvider(String authProvider) {
      this.authProvider = authProvider;
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
    
    public Boolean getCurrent() {
        return this.current;
    }

    public void setCurrent(Boolean current) {
      this.current = current;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Boolean getExpired() {
        return this.expired;
    }

    public void setExpired(Boolean expired) {
      this.expired = expired;
    }
    
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
      this.expiresAt = expiresAt;
    }
    
    public List<String> getGroupPrincipals() {
        return this.groupPrincipals;
    }

    public void setGroupPrincipals(List<String> groupPrincipals) {
      this.groupPrincipals = groupPrincipals;
    }
    
    public Boolean getIsDerived() {
        return this.isDerived;
    }

    public void setIsDerived(Boolean isDerived) {
      this.isDerived = isDerived;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
      this.lastUpdateTime = lastUpdateTime;
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
    
    public Map<String, Object> getProviderInfo() {
        return this.providerInfo;
    }

    public void setProviderInfo(Map<String, Object> providerInfo) {
      this.providerInfo = providerInfo;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
    }
    
    public Integer getTtl() {
        return this.ttl;
    }

    public void setTtl(Integer ttl) {
      this.ttl = ttl;
    }
    
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
      this.userId = userId;
    }
    
    public String getUserPrincipal() {
        return this.userPrincipal;
    }

    public void setUserPrincipal(String userPrincipal) {
      this.userPrincipal = userPrincipal;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
