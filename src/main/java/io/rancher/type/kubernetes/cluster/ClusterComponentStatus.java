package io.rancher.type.kubernetes.cluster;

import io.rancher.base.AbstractType;
import io.rancher.type.ComponentCondition;

import java.util.List;

public class ClusterComponentStatus extends AbstractType {
    
    private List<ComponentCondition> conditions;
    
    private String name;
    
    public List<ComponentCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<ComponentCondition> conditions) {
      this.conditions = conditions;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}
