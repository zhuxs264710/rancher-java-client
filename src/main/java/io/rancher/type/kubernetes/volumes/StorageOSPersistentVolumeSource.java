package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;
import io.rancher.type.ObjectReference;

public class StorageOSPersistentVolumeSource extends AbstractType {
    
    private String fsType;
    
    private Boolean readOnly;
    
    private ObjectReference secretRef;
    
    private String volumeName;
    
    private String volumeNamespace;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public ObjectReference getSecretRef() {
        return this.secretRef;
    }

    public void setSecretRef(ObjectReference secretRef) {
      this.secretRef = secretRef;
    }
    
    public String getVolumeName() {
        return this.volumeName;
    }

    public void setVolumeName(String volumeName) {
      this.volumeName = volumeName;
    }
    
    public String getVolumeNamespace() {
        return this.volumeNamespace;
    }

    public void setVolumeNamespace(String volumeNamespace) {
      this.volumeNamespace = volumeNamespace;
    }
    
}
