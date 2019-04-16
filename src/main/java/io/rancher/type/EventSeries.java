package io.rancher.type;

import io.rancher.base.AbstractType;

public class EventSeries extends AbstractType {
    
    private Integer count;
    
    private MicroTime lastObservedTime;
    
    private String state;
    
    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
      this.count = count;
    }
    
    public MicroTime getLastObservedTime() {
        return this.lastObservedTime;
    }

    public void setLastObservedTime(MicroTime lastObservedTime) {
      this.lastObservedTime = lastObservedTime;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
}
