package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class GcePersistentDiskVolumeSource extends AbstractType {
    
    private String fsType;
    
    private Integer partition;
    
    private String pdName;
    
    private Boolean readOnly;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public Integer getPartition() {
        return this.partition;
    }

    public void setPartition(Integer partition) {
      this.partition = partition;
    }
    
    public String getPdName() {
        return this.pdName;
    }

    public void setPdName(String pdName) {
      this.pdName = pdName;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
}
