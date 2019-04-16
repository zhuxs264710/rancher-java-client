package io.rancher.type;

import io.rancher.base.AbstractType;

public class EventSource extends AbstractType {
    
    private String component;
    
    private String host;
    
    public String getComponent() {
        return this.component;
    }

    public void setComponent(String component) {
      this.component = component;
    }
    
    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
      this.host = host;
    }
    
}
