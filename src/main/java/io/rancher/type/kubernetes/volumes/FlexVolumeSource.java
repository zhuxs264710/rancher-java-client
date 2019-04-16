package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;
import io.rancher.type.LocalObjectReference;

import java.util.Map;

public class FlexVolumeSource extends AbstractType {
    
    private String driver;
    
    private String fsType;
    
    private Map<String, Object> options;
    
    private Boolean readOnly;
    
    private LocalObjectReference secretRef;
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public Map<String, Object> getOptions() {
        return this.options;
    }

    public void setOptions(Map<String, Object> options) {
      this.options = options;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public LocalObjectReference getSecretRef() {
        return this.secretRef;
    }

    public void setSecretRef(LocalObjectReference secretRef) {
      this.secretRef = secretRef;
    }
    
}
