package io.rancher.type.kubernetes.ingress;

import io.rancher.base.AbstractType;
import java.util.Map;

public class IngressRule extends AbstractType {
    
    private String host;
    
    private Map<String, IngressBackend> paths;
    
    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
      this.host = host;
    }
    
    public Map<String, IngressBackend> getPaths() {
        return this.paths;
    }

    public void setPaths(Map<String, IngressBackend> paths) {
      this.paths = paths;
    }
    
}
