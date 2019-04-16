package io.rancher.type.kubernetes.cluster.node;

import io.rancher.base.AbstractType;

public class NodeCondition extends AbstractType {
    
    private String lastHeartbeatTime;
    
    private String lastTransitionTime;
    
    private String message;
    
    private String reason;
    
    private String status;
    
    private String type;
    
    public String getLastHeartbeatTime() {
        return this.lastHeartbeatTime;
    }

    public void setLastHeartbeatTime(String lastHeartbeatTime) {
      this.lastHeartbeatTime = lastHeartbeatTime;
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
