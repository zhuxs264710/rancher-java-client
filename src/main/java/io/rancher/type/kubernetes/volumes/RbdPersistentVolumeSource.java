package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;
import io.rancher.type.SecretReference;

import java.util.List;

public class RbdPersistentVolumeSource extends AbstractType {
    
    private String fsType;
    
    private String image;
    
    private String keyring;
    
    private List<String> monitors;
    
    private String pool;
    
    private Boolean readOnly;
    
    private SecretReference secretRef;
    
    private String user;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getKeyring() {
        return this.keyring;
    }

    public void setKeyring(String keyring) {
      this.keyring = keyring;
    }
    
    public List<String> getMonitors() {
        return this.monitors;
    }

    public void setMonitors(List<String> monitors) {
      this.monitors = monitors;
    }
    
    public String getPool() {
        return this.pool;
    }

    public void setPool(String pool) {
      this.pool = pool;
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
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
