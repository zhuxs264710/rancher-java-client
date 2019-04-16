package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class AttachedVolume extends AbstractType {
    
    private String name;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}
