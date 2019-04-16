package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.StorageClassReclaimPolicyEnum;

public class StorageClass extends AbstractType {
    
    private Boolean allowVolumeExpansion;
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private Map<String, Object> labels;
    
    private List<String> mountOptions;
    /**
     * DnsLabel
     */
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private Map<String, Object> parameters;
    
    private String provisioner;
    
    private StorageClassReclaimPolicyEnum reclaimPolicy;
    
    private String removed;
    
    private String uuid;
    
    private String volumeBindingMode;
    
    public Boolean getAllowVolumeExpansion() {
        return this.allowVolumeExpansion;
    }

    public void setAllowVolumeExpansion(Boolean allowVolumeExpansion) {
      this.allowVolumeExpansion = allowVolumeExpansion;
    }
    
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
    
    public List<String> getMountOptions() {
        return this.mountOptions;
    }

    public void setMountOptions(List<String> mountOptions) {
      this.mountOptions = mountOptions;
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
    
    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
      this.parameters = parameters;
    }
    
    public String getProvisioner() {
        return this.provisioner;
    }

    public void setProvisioner(String provisioner) {
      this.provisioner = provisioner;
    }
    
    public StorageClassReclaimPolicyEnum getReclaimPolicy() {
        return this.reclaimPolicy;
    }

    public void setReclaimPolicy(StorageClassReclaimPolicyEnum reclaimPolicy) {
      this.reclaimPolicy = reclaimPolicy;
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
    
    public String getVolumeBindingMode() {
        return this.volumeBindingMode;
    }

    public void setVolumeBindingMode(String volumeBindingMode) {
      this.volumeBindingMode = volumeBindingMode;
    }
    
}
