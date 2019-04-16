package io.rancher.type.kubernetes.pod;

import io.rancher.base.AbstractType;

public class PodDNSConfigOption extends AbstractType {
    
    private String name;
    
    private String value;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
      this.value = value;
    }
    
}
