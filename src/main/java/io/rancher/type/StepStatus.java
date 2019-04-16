package io.rancher.type;

import io.rancher.base.AbstractType;

public class StepStatus extends AbstractType {
    
    private String ended;
    
    private String started;
    
    private String state;
    
    public String getEnded() {
        return this.ended;
    }

    public void setEnded(String ended) {
      this.ended = ended;
    }
    
    public String getStarted() {
        return this.started;
    }

    public void setStarted(String started) {
      this.started = started;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
}
