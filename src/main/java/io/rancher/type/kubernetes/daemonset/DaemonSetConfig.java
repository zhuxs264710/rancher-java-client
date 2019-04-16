package io.rancher.type.kubernetes.daemonset;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.DaemonSetConfigStrategyEnum;

public class DaemonSetConfig extends AbstractType {
    
    private Integer maxUnavailable;
    
    private Integer minReadySeconds;
    
    private Integer revisionHistoryLimit;
    
    private DaemonSetConfigStrategyEnum strategy;
    
    public Integer getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public void setMaxUnavailable(Integer maxUnavailable) {
      this.maxUnavailable = maxUnavailable;
    }
    
    public Integer getMinReadySeconds() {
        return this.minReadySeconds;
    }

    public void setMinReadySeconds(Integer minReadySeconds) {
      this.minReadySeconds = minReadySeconds;
    }
    
    public Integer getRevisionHistoryLimit() {
        return this.revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
      this.revisionHistoryLimit = revisionHistoryLimit;
    }
    
    public DaemonSetConfigStrategyEnum getStrategy() {
        return this.strategy;
    }

    public void setStrategy(DaemonSetConfigStrategyEnum strategy) {
      this.strategy = strategy;
    }
    
}
