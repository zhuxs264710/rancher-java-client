package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class EmptyDirVolumeSource extends AbstractType {
    
    private String medium;
    
    private String sizeLimit;
    
    public String getMedium() {
        return this.medium;
    }

    public void setMedium(String medium) {
      this.medium = medium;
    }
    
    public String getSizeLimit() {
        return this.sizeLimit;
    }

    public void setSizeLimit(String sizeLimit) {
      this.sizeLimit = sizeLimit;
    }
    
}
