package io.rancher.type.kubernetes.replicationcontroller;

import io.rancher.base.AbstractType;
import java.util.List;

public class ReplicationControllerStatus extends AbstractType {
    
    private Integer availableReplicas;
    
    private List<ReplicationControllerCondition> conditions;
    
    private Integer fullyLabeledReplicas;
    
    private Integer observedGeneration;
    
    private Integer readyReplicas;
    
    private Integer replicas;
    
    public Integer getAvailableReplicas() {
        return this.availableReplicas;
    }

    public void setAvailableReplicas(Integer availableReplicas) {
      this.availableReplicas = availableReplicas;
    }
    
    public List<ReplicationControllerCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<ReplicationControllerCondition> conditions) {
      this.conditions = conditions;
    }
    
    public Integer getFullyLabeledReplicas() {
        return this.fullyLabeledReplicas;
    }

    public void setFullyLabeledReplicas(Integer fullyLabeledReplicas) {
      this.fullyLabeledReplicas = fullyLabeledReplicas;
    }
    
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    public void setObservedGeneration(Integer observedGeneration) {
      this.observedGeneration = observedGeneration;
    }
    
    public Integer getReadyReplicas() {
        return this.readyReplicas;
    }

    public void setReadyReplicas(Integer readyReplicas) {
      this.readyReplicas = readyReplicas;
    }
    
    public Integer getReplicas() {
        return this.replicas;
    }

    public void setReplicas(Integer replicas) {
      this.replicas = replicas;
    }
    
}
