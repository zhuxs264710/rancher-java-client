package io.rancher.type.docker.container;

import io.rancher.base.AbstractType;

public class ContainerStateTerminated extends AbstractType {
    
    private String containerID;
    
    private Integer exitCode;
    
    private String finishedAt;
    
    private String message;
    
    private String reason;
    
    private Integer signal;
    
    private String startedAt;
    
    public String getContainerID() {
        return this.containerID;
    }

    public void setContainerID(String containerID) {
      this.containerID = containerID;
    }
    
    public Integer getExitCode() {
        return this.exitCode;
    }

    public void setExitCode(Integer exitCode) {
      this.exitCode = exitCode;
    }
    
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
      this.finishedAt = finishedAt;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
      this.reason = reason;
    }
    
    public Integer getSignal() {
        return this.signal;
    }

    public void setSignal(Integer signal) {
      this.signal = signal;
    }
    
    public String getStartedAt() {
        return this.startedAt;
    }

    public void setStartedAt(String startedAt) {
      this.startedAt = startedAt;
    }
    
}
