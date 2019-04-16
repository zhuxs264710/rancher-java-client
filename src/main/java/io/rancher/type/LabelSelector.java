package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class LabelSelector extends AbstractType {
    
    private List<LabelSelectorRequirement> matchExpressions;
    
    private Map<String, Object> matchLabels;
    
    public List<LabelSelectorRequirement> getMatchExpressions() {
        return this.matchExpressions;
    }

    public void setMatchExpressions(List<LabelSelectorRequirement> matchExpressions) {
      this.matchExpressions = matchExpressions;
    }
    
    public Map<String, Object> getMatchLabels() {
        return this.matchLabels;
    }

    public void setMatchLabels(Map<String, Object> matchLabels) {
      this.matchLabels = matchLabels;
    }
    
}
