package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;
import java.util.List;

public class FcVolumeSource extends AbstractType {
    
    private String fsType;
    
    private Integer lun;
    
    private Boolean readOnly;
    
    private List<String> targetWWNs;
    
    private List<String> wwids;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public Integer getLun() {
        return this.lun;
    }

    public void setLun(Integer lun) {
      this.lun = lun;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public List<String> getTargetWWNs() {
        return this.targetWWNs;
    }

    public void setTargetWWNs(List<String> targetWWNs) {
      this.targetWWNs = targetWWNs;
    }
    
    public List<String> getWwids() {
        return this.wwids;
    }

    public void setWwids(List<String> wwids) {
      this.wwids = wwids;
    }
    
}
