package io.rancher.type;

import io.rancher.base.AbstractType;

public class PagerdutyConfig extends AbstractType {
    
    private String serviceKey;
    
    public String getServiceKey() {
        return this.serviceKey;
    }

    public void setServiceKey(String serviceKey) {
      this.serviceKey = serviceKey;
    }
    
}
