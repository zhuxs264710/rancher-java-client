package io.rancher.type.kubernetes.cluster.namespaces;

import io.rancher.base.AbstractType;
import io.rancher.type.OwnerReference;

import java.util.List;
import java.util.Map;

public class NamespacedServiceAccountToken extends AbstractType {
    
    private String accountName;
    
    private String accountUid;
    
    private Map<String, Object> annotations;
    
    private String caCrt;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private Map<String, Object> labels;
    /**
     * DnsLabel
     */
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private String projectId;
    
    private String removed;
    
    private String token;
    
    private String uuid;
    
    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
      this.accountName = accountName;
    }
    
    public String getAccountUid() {
        return this.accountUid;
    }

    public void setAccountUid(String accountUid) {
      this.accountUid = accountUid;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getCaCrt() {
        return this.caCrt;
    }

    public void setCaCrt(String caCrt) {
      this.caCrt = caCrt;
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
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
