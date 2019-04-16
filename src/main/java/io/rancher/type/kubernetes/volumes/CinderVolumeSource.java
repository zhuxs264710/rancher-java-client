package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class CinderVolumeSource extends AbstractType {
    
    private String fsType;
    
    private Boolean readOnly;
    
    private String volumeID;
    
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
    
    public String getVolumeID() {
        return this.volumeID;
    }

    public void setVolumeID(String volumeID) {
      this.volumeID = volumeID;
    }
    
}
