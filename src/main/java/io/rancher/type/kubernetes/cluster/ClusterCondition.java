package io.rancher.type.kubernetes.cluster;

import io.rancher.base.AbstractType;

public class ClusterCondition extends AbstractType {
    
    private String lastTransitionTime;
    
    private String lastUpdateTime;
    
    private String message;
    
    private String reason;
    
    private String status;
    
    private String type;
    
    public String getLastTransitionTime() {
        return this.lastTransitionTime;
    }

    public void setLastTransitionTime(String lastTransitionTime) {
      this.lastTransitionTime = lastTransitionTime;
    }
    
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
      this.lastUpdateTime = lastUpdateTime;
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
