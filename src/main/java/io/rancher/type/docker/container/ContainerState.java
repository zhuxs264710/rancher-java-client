package io.rancher.type.docker.container;

import io.rancher.base.AbstractType;

public class ContainerState extends AbstractType {
    
    private ContainerStateRunning running;
    
    private ContainerStateTerminated terminated;
    
    private ContainerStateWaiting waiting;
    
    public ContainerStateRunning getRunning() {
        return this.running;
    }

    public void setRunning(ContainerStateRunning running) {
      this.running = running;
    }
    
    public ContainerStateTerminated getTerminated() {
        return this.terminated;
    }

    public void setTerminated(ContainerStateTerminated terminated) {
      this.terminated = terminated;
    }
    
    public ContainerStateWaiting getWaiting() {
        return this.waiting;
    }

    public void setWaiting(ContainerStateWaiting waiting) {
      this.waiting = waiting;
    }
    
}
