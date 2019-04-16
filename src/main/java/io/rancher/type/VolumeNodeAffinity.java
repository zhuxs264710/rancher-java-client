package io.rancher.type;

import io.rancher.base.AbstractType;

public class VolumeNodeAffinity extends AbstractType {
    
    private NodeSelector required;
    
    public NodeSelector getRequired() {
        return this.required;
    }

    public void setRequired(NodeSelector required) {
      this.required = required;
    }
    
}
