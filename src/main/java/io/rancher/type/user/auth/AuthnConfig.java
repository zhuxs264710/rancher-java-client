package io.rancher.type.user.auth;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class AuthnConfig extends AbstractType {
    
    private Map<String, Object> options;
    
    private List<String> sans;
    
    private String strategy;
    
    public Map<String, Object> getOptions() {
        return this.options;
    }

    public void setOptions(Map<String, Object> options) {
      this.options = options;
    }
    
    public List<String> getSans() {
        return this.sans;
    }

    public void setSans(List<String> sans) {
      this.sans = sans;
    }
    
    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String strategy) {
      this.strategy = strategy;
    }
    
}
