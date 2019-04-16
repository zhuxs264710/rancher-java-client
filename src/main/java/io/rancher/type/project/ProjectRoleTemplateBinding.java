package io.rancher.type.project;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.type.OwnerReference;

public class ProjectRoleTemplateBinding extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private String groupId;
    
    private String groupPrincipalId;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private String projectId;
    
    private String removed;
    
    private String roleTemplateId;
    
    private String userId;
    
    private String userPrincipalId;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
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
    
    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
      this.groupId = groupId;
    }
    
    public String getGroupPrincipalId() {
        return this.groupPrincipalId;
    }

    public void setGroupPrincipalId(String groupPrincipalId) {
      this.groupPrincipalId = groupPrincipalId;
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
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getRoleTemplateId() {
        return this.roleTemplateId;
    }

    public void setRoleTemplateId(String roleTemplateId) {
      this.roleTemplateId = roleTemplateId;
    }
    
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
      this.userId = userId;
    }
    
    public String getUserPrincipalId() {
        return this.userPrincipalId;
    }

    public void setUserPrincipalId(String userPrincipalId) {
      this.userPrincipalId = userPrincipalId;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
