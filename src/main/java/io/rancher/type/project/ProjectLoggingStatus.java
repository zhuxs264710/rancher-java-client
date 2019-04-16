package io.rancher.type.project;

import java.util.List;

import io.rancher.base.AbstractType;
import io.rancher.type.LoggingCondition;

public class ProjectLoggingStatus extends AbstractType {
    
    private ProjectLoggingSpec appliedSpec;
    
    private List<LoggingCondition> conditions;
    
    public ProjectLoggingSpec getAppliedSpec() {
        return this.appliedSpec;
    }

    public void setAppliedSpec(ProjectLoggingSpec appliedSpec) {
      this.appliedSpec = appliedSpec;
    }
    
    public List<LoggingCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<LoggingCondition> conditions) {
      this.conditions = conditions;
    }
    
}
