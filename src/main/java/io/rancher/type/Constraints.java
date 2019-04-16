package io.rancher.type;

import io.rancher.base.AbstractType;

public class Constraints extends AbstractType {
    
    private Constraint branch;
    
    private Constraint event;
    
    public Constraint getBranch() {
        return this.branch;
    }

    public void setBranch(Constraint branch) {
      this.branch = branch;
    }
    
    public Constraint getEvent() {
        return this.event;
    }

    public void setEvent(Constraint event) {
      this.event = event;
    }
    
}
