package io.rancher.type.kubernetes.volumes;

import java.util.List;

import io.rancher.base.AbstractType;
import io.rancher.type.SecretReference;

public class IscsiPersistentVolumeSource extends AbstractType {
    
    private Boolean chapAuthDiscovery;
    
    private Boolean chapAuthSession;
    
    private String fsType;
    
    private String initiatorName;
    
    private String iqn;
    
    private String iscsiInterface;
    
    private Integer lun;
    
    private List<String> portals;
    
    private Boolean readOnly;
    
    private SecretReference secretRef;
    
    private String targetPortal;
    
    public Boolean getChapAuthDiscovery() {
        return this.chapAuthDiscovery;
    }

    public void setChapAuthDiscovery(Boolean chapAuthDiscovery) {
      this.chapAuthDiscovery = chapAuthDiscovery;
    }
    
    public Boolean getChapAuthSession() {
        return this.chapAuthSession;
    }

    public void setChapAuthSession(Boolean chapAuthSession) {
      this.chapAuthSession = chapAuthSession;
    }
    
    public String getFsType() {
        return this.fsType;
    }

    public void setFsType(String fsType) {
      this.fsType = fsType;
    }
    
    public String getInitiatorName() {
        return this.initiatorName;
    }

    public void setInitiatorName(String initiatorName) {
      this.initiatorName = initiatorName;
    }
    
    public String getIqn() {
        return this.iqn;
    }

    public void setIqn(String iqn) {
      this.iqn = iqn;
    }
    
    public String getIscsiInterface() {
        return this.iscsiInterface;
    }

    public void setIscsiInterface(String iscsiInterface) {
      this.iscsiInterface = iscsiInterface;
    }
    
    public Integer getLun() {
        return this.lun;
    }

    public void setLun(Integer lun) {
      this.lun = lun;
    }
    
    public List<String> getPortals() {
        return this.portals;
    }

    public void setPortals(List<String> portals) {
      this.portals = portals;
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
    
    public String getTargetPortal() {
        return this.targetPortal;
    }

    public void setTargetPortal(String targetPortal) {
      this.targetPortal = targetPortal;
    }
    
}
