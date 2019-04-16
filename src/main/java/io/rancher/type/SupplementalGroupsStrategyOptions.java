package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class SupplementalGroupsStrategyOptions extends AbstractType {
    
    private List<IdRange> ranges;
    
    private String rule;
    
    public List<IdRange> getRanges() {
        return this.ranges;
    }

    public void setRanges(List<IdRange> ranges) {
      this.ranges = ranges;
    }
    
    public String getRule() {
        return this.rule;
    }

    public void setRule(String rule) {
      this.rule = rule;
    }
    
}
