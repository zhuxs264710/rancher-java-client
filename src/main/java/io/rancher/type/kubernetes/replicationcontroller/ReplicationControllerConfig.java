package io.rancher.type.kubernetes.replicationcontroller;

import io.rancher.base.AbstractType;

public class ReplicationControllerConfig extends AbstractType {
    
    private Integer minReadySeconds;
    
    public Integer getMinReadySeconds() {
        return this.minReadySeconds;
    }

    public void setMinReadySeconds(Integer minReadySeconds) {
      this.minReadySeconds = minReadySeconds;
    }
    
}
