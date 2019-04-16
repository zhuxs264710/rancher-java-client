package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class NodeSelector extends AbstractType {
    
    private List<NodeSelectorTerm> nodeSelectorTerms;
    
    public List<NodeSelectorTerm> getNodeSelectorTerms() {
        return this.nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(List<NodeSelectorTerm> nodeSelectorTerms) {
      this.nodeSelectorTerms = nodeSelectorTerms;
    }
    
}
