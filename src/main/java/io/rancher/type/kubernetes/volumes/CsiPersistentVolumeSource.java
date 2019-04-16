package io.rancher.type.kubernetes.volumes;

import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.type.SecretReference;

public class CsiPersistentVolumeSource extends AbstractType {
    
    private SecretReference controllerPublishSecretRef;
    
    private String driver;
    
    private String fsType;
    
    private SecretReference nodePublishSecretRef;
    
    private SecretReference nodeStageSecretRef;
    
    private Boolean readOnly;
    
    private Map<String, Object> volumeAttributes;
    
    private String volumeHandle;
    
    public SecretReference getControllerPublishSecretRef() {
        return this.controllerPublishSecretRef;
    }

    public void setControllerPublishSecretRef(SecretReference controllerPublishSecretRef) {
      this.controllerPublishSecretRef = controllerPublishSecretRef;
    }
    
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
    
    public SecretReference getNodePublishSecretRef() {
        return this.nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(SecretReference nodePublishSecretRef) {
      this.nodePublishSecretRef = nodePublishSecretRef;
    }
    
    public SecretReference getNodeStageSecretRef() {
        return this.nodeStageSecretRef;
    }

    public void setNodeStageSecretRef(SecretReference nodeStageSecretRef) {
      this.nodeStageSecretRef = nodeStageSecretRef;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public Map<String, Object> getVolumeAttributes() {
        return this.volumeAttributes;
    }

    public void setVolumeAttributes(Map<String, Object> volumeAttributes) {
      this.volumeAttributes = volumeAttributes;
    }
    
    public String getVolumeHandle() {
        return this.volumeHandle;
    }

    public void setVolumeHandle(String volumeHandle) {
      this.volumeHandle = volumeHandle;
    }
    
}
