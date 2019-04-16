package io.rancher.type.kubernetes.job;

import io.rancher.base.AbstractType;
import java.util.List;

public class JobStatus extends AbstractType {
    
    private Integer active;
    
    private String completionTime;
    
    private List<JobCondition> conditions;
    
    private Integer failed;
    
    private String startTime;
    
    private Integer succeeded;
    
    public Integer getActive() {
        return this.active;
    }

    public void setActive(Integer active) {
      this.active = active;
    }
    
    public String getCompletionTime() {
        return this.completionTime;
    }

    public void setCompletionTime(String completionTime) {
      this.completionTime = completionTime;
    }
    
    public List<JobCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<JobCondition> conditions) {
      this.conditions = conditions;
    }
    
    public Integer getFailed() {
        return this.failed;
    }

    public void setFailed(Integer failed) {
      this.failed = failed;
    }
    
    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
      this.startTime = startTime;
    }
    
    public Integer getSucceeded() {
        return this.succeeded;
    }

    public void setSucceeded(Integer succeeded) {
      this.succeeded = succeeded;
    }
    
}
