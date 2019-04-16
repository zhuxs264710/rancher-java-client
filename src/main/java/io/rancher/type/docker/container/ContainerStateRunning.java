package io.rancher.type.docker.container;

import io.rancher.base.AbstractType;

public class ContainerStateRunning extends AbstractType {
    
    private String startedAt;
    
    public String getStartedAt() {
        return this.startedAt;
    }

    public void setStartedAt(String startedAt) {
      this.startedAt = startedAt;
    }
    
}
