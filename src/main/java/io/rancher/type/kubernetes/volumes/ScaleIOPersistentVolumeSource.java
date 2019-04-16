package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;
import io.rancher.type.SecretReference;

public class ScaleIOPersistentVolumeSource extends AbstractType {
    
    private String fsType;
    
    private String gateway;
    
    private String protectionDomain;
    
    private Boolean readOnly;
    
    private SecretReference secretRef;
    
    private Boolean sslEnabled;
    
    private String storageMode;
    
    private String storagePool;
    
    private String system;
    
    private String volumeName;
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public String getGateway() {
        return this.gateway;
    }

    public void setGateway(String gateway) {
      this.gateway = gateway;
    }
    
    public String getProtectionDomain() {
        return this.protectionDomain;
    }

    public void setProtectionDomain(String protectionDomain) {
      this.protectionDomain = protectionDomain;
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
    
    public Boolean getSslEnabled() {
        return this.sslEnabled;
    }

    public void setSslEnabled(Boolean sslEnabled) {
      this.sslEnabled = sslEnabled;
    }
    
    public String getStorageMode() {
        return this.storageMode;
    }

    public void setStorageMode(String storageMode) {
      this.storageMode = storageMode;
    }
    
    public String getStoragePool() {
        return this.storagePool;
    }

    public void setStoragePool(String storagePool) {
      this.storagePool = storagePool;
    }
    
    public String getSystem() {
        return this.system;
    }

    public void setSystem(String system) {
      this.system = system;
    }
    
    public String getVolumeName() {
        return this.volumeName;
    }

    public void setVolumeName(String volumeName) {
      this.volumeName = volumeName;
    }
    
}
