package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.TargetPodConditionEnum;

public class TargetPod extends AbstractType {
    
    private TargetPodConditionEnum condition;
    
    private String podId;
    
    private Integer restartIntervalSeconds;
    
    private Integer restartTimes;
    
    public TargetPodConditionEnum getCondition() {
        return this.condition;
    }

    public void setCondition(TargetPodConditionEnum condition) {
      this.condition = condition;
    }
    
    public String getPodId() {
        return this.podId;
    }

    public void setPodId(String podId) {
      this.podId = podId;
    }
    
    public Integer getRestartIntervalSeconds() {
        return this.restartIntervalSeconds;
    }

    public void setRestartIntervalSeconds(Integer restartIntervalSeconds) {
      this.restartIntervalSeconds = restartIntervalSeconds;
    }
    
    public Integer getRestartTimes() {
        return this.restartTimes;
    }

    public void setRestartTimes(Integer restartTimes) {
      this.restartTimes = restartTimes;
    }
    
}
