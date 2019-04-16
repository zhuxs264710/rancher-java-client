package io.rancher.type.kubernetes.volumes.persistentvolume;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.PersistentVolumeClaimAccessModesEnum;
import io.rancher.model.enums.PersistentVolumeClaimTransitioningEnum;
import io.rancher.type.LabelSelector;
import io.rancher.type.OwnerReference;
import io.rancher.type.ResourceRequirements;

public class PersistentVolumeClaim extends AbstractType {
    
    private PersistentVolumeClaimAccessModesEnum accessModes;
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private Map<String, Object> labels;
    /**
     * DnsLabel
     */
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private String projectId;
    
    private String removed;
    
    private ResourceRequirements resources;
    
    private LabelSelector selector;
    
    private String state;
    
    private PersistentVolumeClaimStatus status;
    
    private String storageClassId;
    
    private PersistentVolumeClaimTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    private String volumeId;
    
    private String volumeMode;
    
    public PersistentVolumeClaimAccessModesEnum getAccessModes() {
        return this.accessModes;
    }

    public void setAccessModes(PersistentVolumeClaimAccessModesEnum accessModes) {
      this.accessModes = accessModes;
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
    
    public ResourceRequirements getResources() {
        return this.resources;
    }

    public void setResources(ResourceRequirements resources) {
      this.resources = resources;
    }
    
    public LabelSelector getSelector() {
        return this.selector;
    }

    public void setSelector(LabelSelector selector) {
      this.selector = selector;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public PersistentVolumeClaimStatus getStatus() {
        return this.status;
    }

    public void setStatus(PersistentVolumeClaimStatus status) {
      this.status = status;
    }
    
    public String getStorageClassId() {
        return this.storageClassId;
    }

    public void setStorageClassId(String storageClassId) {
      this.storageClassId = storageClassId;
    }
    
    public PersistentVolumeClaimTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(PersistentVolumeClaimTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getVolumeId() {
        return this.volumeId;
    }

    public void setVolumeId(String volumeId) {
      this.volumeId = volumeId;
    }
    
    public String getVolumeMode() {
        return this.volumeMode;
    }

    public void setVolumeMode(String volumeMode) {
      this.volumeMode = volumeMode;
    }
    
}
