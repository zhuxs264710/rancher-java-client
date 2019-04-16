package io.rancher.type.docker.container;

import io.rancher.base.AbstractType;

public class ContainerStatus extends AbstractType {
    
    private String containerID;
    
    private String image;
    
    private String imageID;
    
    private ContainerState lastState;
    
    private String name;
    
    private Boolean ready;
    
    private Integer restartCount;
    
    private ContainerState state;
    
    public String getContainerID() {
        return this.containerID;
    }

    public void setContainerID(String containerID) {
      this.containerID = containerID;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getImageID() {
        return this.imageID;
    }

    public void setImageID(String imageID) {
      this.imageID = imageID;
    }
    
    public ContainerState getLastState() {
        return this.lastState;
    }

    public void setLastState(ContainerState lastState) {
      this.lastState = lastState;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Boolean getReady() {
        return this.ready;
    }

    public void setReady(Boolean ready) {
      this.ready = ready;
    }
    
    public Integer getRestartCount() {
        return this.restartCount;
    }

    public void setRestartCount(Integer restartCount) {
      this.restartCount = restartCount;
    }
    
    public ContainerState getState() {
        return this.state;
    }

    public void setState(ContainerState state) {
      this.state = state;
    }
    
}
