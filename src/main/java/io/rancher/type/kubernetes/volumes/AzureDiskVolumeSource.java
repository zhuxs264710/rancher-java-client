package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class AzureDiskVolumeSource extends AbstractType {
    
    private String cachingMode;
    
    private String diskName;
    
    private String diskURI;
    
    private String fsType;
    
    private String kind;
    
    private Boolean readOnly;
    
    public String getCachingMode() {
        return this.cachingMode;
    }

    public void setCachingMode(String cachingMode) {
      this.cachingMode = cachingMode;
    }
    
    public String getDiskName() {
        return this.diskName;
    }

    public void setDiskName(String diskName) {
      this.diskName = diskName;
    }
    
    public String getDiskURI() {
        return this.diskURI;
    }

    public void setDiskURI(String diskURI) {
      this.diskURI = diskURI;
    }
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
}
