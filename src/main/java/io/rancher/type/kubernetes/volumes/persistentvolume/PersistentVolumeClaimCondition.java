package io.rancher.type.kubernetes.volumes.persistentvolume;

import io.rancher.base.AbstractType;

public class PersistentVolumeClaimCondition extends AbstractType {
    
    private String lastProbeTime;
    
    private String lastTransitionTime;
    
    private String message;
    
    private String reason;
    
    private String status;
    
    private String type;
    
    public String getLastProbeTime() {
        return this.lastProbeTime;
    }

    public void setLastProbeTime(String lastProbeTime) {
      this.lastProbeTime = lastProbeTime;
    }
    
    public String getLastTransitionTime() {
        return this.lastTransitionTime;
    }

    public void setLastTransitionTime(String lastTransitionTime) {
      this.lastTransitionTime = lastTransitionTime;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
      this.reason = reason;
    }
    
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
      this.status = status;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
}
