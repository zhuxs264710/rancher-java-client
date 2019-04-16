package io.rancher.type.user;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.UserTransitioningEnum;
import io.rancher.type.OwnerReference;

public class User extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private List<UserCondition> conditions;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private Boolean enabled;
    
    private Map<String, Object> labels;
    
    private Boolean me;
    
    private Boolean mustChangePassword;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String password;
    
    private List<String> principalIds;
    
    private String removed;
    
    private String state;
    
    private UserTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String username;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public List<UserCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<UserCondition> conditions) {
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Boolean getMe() {
        return this.me;
    }

    public void setMe(Boolean me) {
      this.me = me;
    }
    
    public Boolean getMustChangePassword() {
        return this.mustChangePassword;
    }

    public void setMustChangePassword(Boolean mustChangePassword) {
      this.mustChangePassword = mustChangePassword;
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
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public List<String> getPrincipalIds() {
        return this.principalIds;
    }

    public void setPrincipalIds(List<String> principalIds) {
      this.principalIds = principalIds;
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
    
    public UserTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(UserTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
