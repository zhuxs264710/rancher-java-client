package io.rancher.type.kubernetes.statefulset;

import java.util.List;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.StatefulSetConfigPodManagementPolicyEnum;
import io.rancher.model.enums.StatefulSetConfigStrategyEnum;
import io.rancher.type.kubernetes.volumes.persistentvolume.PersistentVolumeClaim;

public class StatefulSetConfig extends AbstractType {
    
    private Integer partition;
    
    private StatefulSetConfigPodManagementPolicyEnum podManagementPolicy;
    
    private Integer revisionHistoryLimit;
    
    private String serviceName;
    
    private StatefulSetConfigStrategyEnum strategy;
    
    private List<PersistentVolumeClaim> volumeClaimTemplates;
    
    public Integer getPartition() {
        return this.partition;
    }

    public void setPartition(Integer partition) {
      this.partition = partition;
    }
    
    public StatefulSetConfigPodManagementPolicyEnum getPodManagementPolicy() {
        return this.podManagementPolicy;
    }

    public void setPodManagementPolicy(StatefulSetConfigPodManagementPolicyEnum podManagementPolicy) {
      this.podManagementPolicy = podManagementPolicy;
    }
    
    public Integer getRevisionHistoryLimit() {
        return this.revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
      this.revisionHistoryLimit = revisionHistoryLimit;
    }
    
    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String serviceName) {
      this.serviceName = serviceName;
    }
    
    public StatefulSetConfigStrategyEnum getStrategy() {
        return this.strategy;
    }

    public void setStrategy(StatefulSetConfigStrategyEnum strategy) {
      this.strategy = strategy;
    }
    
    public List<PersistentVolumeClaim> getVolumeClaimTemplates() {
        return this.volumeClaimTemplates;
    }

    public void setVolumeClaimTemplates(List<PersistentVolumeClaim> volumeClaimTemplates) {
      this.volumeClaimTemplates = volumeClaimTemplates;
    }
    
}
