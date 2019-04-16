package io.rancher.type.user.auth;

import io.rancher.base.AbstractType;
import java.util.Map;

public class AuthzConfig extends AbstractType {
    
    private String mode;
    
    private Map<String, Object> options;
    
    public String getMode() {
        return this.mode;
    }

    public void setMode(String mode) {
      this.mode = mode;
    }
    
    public Map<String, Object> getOptions() {
        return this.options;
    }

    public void setOptions(Map<String, Object> options) {
      this.options = options;
    }
    
}
