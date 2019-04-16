package io.rancher.type.kubernetes.volumes;

import java.util.List;

import io.rancher.base.AbstractType;
import io.rancher.type.SecretReference;

public class CephFSPersistentVolumeSource extends AbstractType {
    
    private List<String> monitors;
    
    private String path;
    
    private Boolean readOnly;
    
    private String secretFile;
    
    private SecretReference secretRef;
    
    private String user;
    
    public List<String> getMonitors() {
        return this.monitors;
    }

    public void setMonitors(List<String> monitors) {
      this.monitors = monitors;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public String getSecretFile() {
        return this.secretFile;
    }

    public void setSecretFile(String secretFile) {
      this.secretFile = secretFile;
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
