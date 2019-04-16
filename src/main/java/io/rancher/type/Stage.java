package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Stage extends AbstractType {
    
    private String name;
    
    private List<Step> steps;
    
    private Constraints when;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<Step> getSteps() {
        return this.steps;
    }

    public void setSteps(List<Step> steps) {
      this.steps = steps;
    }
    
    public Constraints getWhen() {
        return this.when;
    }

    public void setWhen(Constraints when) {
      this.when = when;
    }
    
}
