package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class MonitoringConfig extends AbstractType {
    
    private Map<String, Object> options;
    
    private String provider;
    
    public Map<String, Object> getOptions() {
        return this.options;
    }

    public void setOptions(Map<String, Object> options) {
      this.options = options;
    }
    
    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
      this.provider = provider;
    }
    
}
