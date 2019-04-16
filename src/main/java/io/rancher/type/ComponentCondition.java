package io.rancher.type;

import io.rancher.base.AbstractType;

public class ComponentCondition extends AbstractType {
    
    private String error;
    
    private String message;
    
    private String status;
    
    private String type;
    
    public String getError() {
        return this.error;
    }

    public void setError(String error) {
      this.error = error;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
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
