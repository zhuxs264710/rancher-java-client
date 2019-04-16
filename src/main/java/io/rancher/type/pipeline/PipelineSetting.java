package io.rancher.type.pipeline;

import io.rancher.base.AbstractType;
import io.rancher.type.OwnerReference;

import java.util.Map;
import java.util.List;

public class PipelineSetting extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private Boolean customized;
    /**
     * default
     */
    private String defaultStr;
    
    private Map<String, Object> labels;
    /**
     * DnsLabel
     */
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private String projectId;
    
    private String removed;
    
    private String uuid;
    
    private String value;
    
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
    
    public Boolean getCustomized() {
        return this.customized;
    }

    public void setCustomized(Boolean customized) {
      this.customized = customized;
    }
    
    public String getDefault() {
        return this.defaultStr;
    }

    public void setDefault(String defaultStr) {
      this.defaultStr = defaultStr;
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
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
      this.value = value;
    }
    
}
