package io.rancher.type.kubernetes.cluster.node;

import io.rancher.base.AbstractType;
import io.rancher.type.Condition;

import java.util.List;

public class NodePoolStatus extends AbstractType {
    
    private List<Condition> conditions;
    
    public List<Condition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<Condition> conditions) {
      this.conditions = conditions;
    }
    
}
