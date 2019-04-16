package io.rancher.type.cronjob;

import io.rancher.base.AbstractType;
import io.rancher.type.ObjectReference;

import java.util.List;

public class CronJobStatus extends AbstractType {
    
    private List<ObjectReference> active;
    
    private String lastScheduleTime;
    
    public List<ObjectReference> getActive() {
        return this.active;
    }

    public void setActive(List<ObjectReference> active) {
      this.active = active;
    }
    
    public String getLastScheduleTime() {
        return this.lastScheduleTime;
    }

    public void setLastScheduleTime(String lastScheduleTime) {
      this.lastScheduleTime = lastScheduleTime;
    }
    
}
