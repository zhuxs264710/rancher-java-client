package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class PersistentVolumeClaimVolumeSource extends AbstractType {
    
    private String persistentVolumeClaimId;
    
    private Boolean readOnly;
    
    public String getPersistentVolumeClaimId() {
        return this.persistentVolumeClaimId;
    }

    public void setPersistentVolumeClaimId(String persistentVolumeClaimId) {
      this.persistentVolumeClaimId = persistentVolumeClaimId;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
}
