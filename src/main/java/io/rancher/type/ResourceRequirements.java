package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class ResourceRequirements extends AbstractType {
    
    private Map<String, Object> limits;
    
    private Map<String, Object> requests;
    
    public Map<String, Object> getLimits() {
        return this.limits;
    }

    public void setLimits(Map<String, Object> limits) {
      this.limits = limits;
    }
    
    public Map<String, Object> getRequests() {
        return this.requests;
    }

    public void setRequests(Map<String, Object> requests) {
      this.requests = requests;
    }
    
}
