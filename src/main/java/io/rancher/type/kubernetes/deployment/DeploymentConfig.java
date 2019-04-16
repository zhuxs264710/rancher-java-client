package io.rancher.type.kubernetes.deployment;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.DeploymentConfigStrategyEnum;

public class DeploymentConfig extends AbstractType {
    
    private String maxSurge;
    
    private String maxUnavailable;
    
    private String minReadySeconds;
    
    private String progressDeadlineSeconds;
    
    private String revisionHistoryLimit;
    
    private DeploymentConfigStrategyEnum strategy;
    
    public String getMaxSurge() {
        return this.maxSurge;
    }

    public void setMaxSurge(String maxSurge) {
      this.maxSurge = maxSurge;
    }
    
    public String getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public void setMaxUnavailable(String maxUnavailable) {
      this.maxUnavailable = maxUnavailable;
    }
    
    public String getMinReadySeconds() {
        return this.minReadySeconds;
    }

    public void setMinReadySeconds(String minReadySeconds) {
      this.minReadySeconds = minReadySeconds;
    }
    
    public String getProgressDeadlineSeconds() {
        return this.progressDeadlineSeconds;
    }

    public void setProgressDeadlineSeconds(String progressDeadlineSeconds) {
      this.progressDeadlineSeconds = progressDeadlineSeconds;
    }
    
    public String getRevisionHistoryLimit() {
        return this.revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(String revisionHistoryLimit) {
      this.revisionHistoryLimit = revisionHistoryLimit;
    }
    
    public DeploymentConfigStrategyEnum getStrategy() {
        return this.strategy;
    }

    public void setStrategy(DeploymentConfigStrategyEnum strategy) {
      this.strategy = strategy;
    }
    
}
