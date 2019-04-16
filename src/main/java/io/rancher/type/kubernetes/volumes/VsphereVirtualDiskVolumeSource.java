package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class VsphereVirtualDiskVolumeSource extends AbstractType {
    
    private String fsType;
    
    private String storagePolicyID;
    
    private String storagePolicyName;
    
    private String volumePath;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public String getStoragePolicyID() {
        return this.storagePolicyID;
    }

    public void setStoragePolicyID(String storagePolicyID) {
      this.storagePolicyID = storagePolicyID;
    }
    
    public String getStoragePolicyName() {
        return this.storagePolicyName;
    }

    public void setStoragePolicyName(String storagePolicyName) {
      this.storagePolicyName = storagePolicyName;
    }
    
    public String getVolumePath() {
        return this.volumePath;
    }

    public void setVolumePath(String volumePath) {
      this.volumePath = volumePath;
    }
    
}
