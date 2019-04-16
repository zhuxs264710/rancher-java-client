package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class NodeSelectorTerm extends AbstractType {
    
    private List<NodeSelectorRequirement> matchExpressions;
    
    public List<NodeSelectorRequirement> getMatchExpressions() {
        return this.matchExpressions;
    }

    public void setMatchExpressions(List<NodeSelectorRequirement> matchExpressions) {
      this.matchExpressions = matchExpressions;
    }
    
}
