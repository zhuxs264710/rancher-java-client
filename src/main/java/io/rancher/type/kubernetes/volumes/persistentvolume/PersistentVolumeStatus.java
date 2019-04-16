package io.rancher.type.kubernetes.volumes.persistentvolume;

import io.rancher.base.AbstractType;

public class PersistentVolumeStatus extends AbstractType {
    
    private String message;
    
    private String phase;
    
    private String reason;
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
      this.phase = phase;
    }
    
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
      this.reason = reason;
    }
    
}
