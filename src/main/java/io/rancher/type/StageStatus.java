package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class StageStatus extends AbstractType {
    
    private String ended;
    
    private String started;
    
    private String state;
    
    private List<StepStatus> steps;
    
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
    
    public List<StepStatus> getSteps() {
        return this.steps;
    }

    public void setSteps(List<StepStatus> steps) {
      this.steps = steps;
    }
    
}
