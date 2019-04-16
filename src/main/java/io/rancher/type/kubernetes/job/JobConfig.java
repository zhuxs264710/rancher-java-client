package io.rancher.type.kubernetes.job;

import io.rancher.base.AbstractType;

public class JobConfig extends AbstractType {
    
    private Integer activeDeadlineSeconds;
    
    private Integer backoffLimit;
    
    private Integer completions;
    
    private Boolean manualSelector;
    
    private Integer parallelism;
    
    public Integer getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
      this.activeDeadlineSeconds = activeDeadlineSeconds;
    }
    
    public Integer getBackoffLimit() {
        return this.backoffLimit;
    }

    public void setBackoffLimit(Integer backoffLimit) {
      this.backoffLimit = backoffLimit;
    }
    
    public Integer getCompletions() {
        return this.completions;
    }

    public void setCompletions(Integer completions) {
      this.completions = completions;
    }
    
    public Boolean getManualSelector() {
        return this.manualSelector;
    }

    public void setManualSelector(Boolean manualSelector) {
      this.manualSelector = manualSelector;
    }
    
    public Integer getParallelism() {
        return this.parallelism;
    }

    public void setParallelism(Integer parallelism) {
      this.parallelism = parallelism;
    }
    
}
