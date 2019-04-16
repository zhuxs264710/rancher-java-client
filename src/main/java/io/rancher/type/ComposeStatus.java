package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class ComposeStatus extends AbstractType {
    
    private List<ComposeCondition> conditions;
    
    public List<ComposeCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<ComposeCondition> conditions) {
      this.conditions = conditions;
    }
    
}
