package io.rancher.type.kubernetes.volumes;

import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.type.SecretReference;

public class FlexPersistentVolumeSource extends AbstractType {
    
    private String driver;
    
    private String fsType;
    
    private Map<String, Object> options;
    
    private Boolean readOnly;
    
    private SecretReference secretRef;
    
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
    
    public SecretReference getSecretRef() {
        return this.secretRef;
    }

    public void setSecretRef(SecretReference secretRef) {
      this.secretRef = secretRef;
    }
    
}
