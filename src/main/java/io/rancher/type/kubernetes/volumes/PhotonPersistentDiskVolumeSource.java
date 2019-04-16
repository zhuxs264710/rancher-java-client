package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class PhotonPersistentDiskVolumeSource extends AbstractType {
    
    private String fsType;
    
    private String pdID;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public String getPdID() {
        return this.pdID;
    }

    public void setPdID(String pdID) {
      this.pdID = pdID;
    }
    
}
