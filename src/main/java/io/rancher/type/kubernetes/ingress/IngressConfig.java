package io.rancher.type.kubernetes.ingress;

import io.rancher.base.AbstractType;
import java.util.Map;

public class IngressConfig extends AbstractType {
    
    private Map<String, Object> extraArgs;
    
    private Map<String, Object> nodeSelector;
    
    private Map<String, Object> options;
    
    private String provider;
    
    public Map<String, Object> getExtraArgs() {
        return this.extraArgs;
    }

    public void setExtraArgs(Map<String, Object> extraArgs) {
      this.extraArgs = extraArgs;
    }
    
    public Map<String, Object> getNodeSelector() {
        return this.nodeSelector;
    }

    public void setNodeSelector(Map<String, Object> nodeSelector) {
      this.nodeSelector = nodeSelector;
    }
    
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
