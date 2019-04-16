package io.rancher.type.kubernetes.cluster.node;

import io.rancher.base.AbstractType;
import java.util.List;

public class NodeTemplateStatus extends AbstractType {
    
    private List<NodeTemplateCondition> conditions;
    
    public List<NodeTemplateCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<NodeTemplateCondition> conditions) {
      this.conditions = conditions;
    }
    
}
