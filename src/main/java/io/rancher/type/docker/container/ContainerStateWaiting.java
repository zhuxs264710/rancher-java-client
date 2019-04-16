package io.rancher.type.docker.container;

import io.rancher.base.AbstractType;

public class ContainerStateWaiting extends AbstractType {
    
    private String message;
    
    private String reason;
    
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
    
}
