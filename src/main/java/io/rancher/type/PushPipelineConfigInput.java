package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class PushPipelineConfigInput extends AbstractType {
    
    private Map<String, Object> configs;
    
    public Map<String, Object> getConfigs() {
        return this.configs;
    }

    public void setConfigs(Map<String, Object> configs) {
      this.configs = configs;
    }
    
}
