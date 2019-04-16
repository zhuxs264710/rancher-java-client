package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class RoleTemplate extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private Boolean builtin;
    
    private Boolean clusterCreatorDefault;
    
    private String context;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private Boolean external;
    
    private Boolean hidden;
    
    private Map<String, Object> labels;
    
    private Boolean locked;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private Boolean projectCreatorDefault;
    
    private String removed;
    
    private List<String> roleTemplateIds;
    
    private List<PolicyRule> rules;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Boolean getBuiltin() {
        return this.builtin;
    }

    public void setBuiltin(Boolean builtin) {
      this.builtin = builtin;
    }
    
    public Boolean getClusterCreatorDefault() {
        return this.clusterCreatorDefault;
    }

    public void setClusterCreatorDefault(Boolean clusterCreatorDefault) {
      this.clusterCreatorDefault = clusterCreatorDefault;
    }
    
    public String getContext() {
        return this.context;
    }

    public void setContext(String context) {
      this.context = context;
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
    
    public Boolean getExternal() {
        return this.external;
    }

    public void setExternal(Boolean external) {
      this.external = external;
    }
    
    public Boolean getHidden() {
        return this.hidden;
    }

    public void setHidden(Boolean hidden) {
      this.hidden = hidden;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Boolean getLocked() {
        return this.locked;
    }

    public void setLocked(Boolean locked) {
      this.locked = locked;
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
    
    public Boolean getProjectCreatorDefault() {
        return this.projectCreatorDefault;
    }

    public void setProjectCreatorDefault(Boolean projectCreatorDefault) {
      this.projectCreatorDefault = projectCreatorDefault;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public List<String> getRoleTemplateIds() {
        return this.roleTemplateIds;
    }

    public void setRoleTemplateIds(List<String> roleTemplateIds) {
      this.roleTemplateIds = roleTemplateIds;
    }
    
    public List<PolicyRule> getRules() {
        return this.rules;
    }

    public void setRules(List<PolicyRule> rules) {
      this.rules = rules;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
