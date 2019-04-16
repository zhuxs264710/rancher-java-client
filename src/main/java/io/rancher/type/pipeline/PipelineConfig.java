package io.rancher.type.pipeline;

import io.rancher.base.AbstractType;
import io.rancher.type.Constraint;
import io.rancher.type.Stage;

import java.util.List;

public class PipelineConfig extends AbstractType {
    
    private Constraint branch;
    
    private List<Stage> stages;
    
    private Integer timeout;
    
    public Constraint getBranch() {
        return this.branch;
    }

    public void setBranch(Constraint branch) {
      this.branch = branch;
    }
    
    public List<Stage> getStages() {
        return this.stages;
    }

    public void setStages(List<Stage> stages) {
      this.stages = stages;
    }
    
    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
      this.timeout = timeout;
    }
    
}
