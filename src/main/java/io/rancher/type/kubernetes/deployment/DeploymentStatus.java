package io.rancher.type.kubernetes.deployment;

import io.rancher.base.AbstractType;
import java.util.List;

public class DeploymentStatus extends AbstractType {
    
    private Integer availableReplicas;
    
    private Integer collisionCount;
    
    private List<DeploymentCondition> conditions;
    
    private Integer observedGeneration;
    
    private Integer readyReplicas;
    
    private Integer replicas;
    
    private Integer unavailableReplicas;
    
    private Integer updatedReplicas;
    
    public Integer getAvailableReplicas() {
        return this.availableReplicas;
    }

    public void setAvailableReplicas(Integer availableReplicas) {
      this.availableReplicas = availableReplicas;
    }
    
    public Integer getCollisionCount() {
        return this.collisionCount;
    }

    public void setCollisionCount(Integer collisionCount) {
      this.collisionCount = collisionCount;
    }
    
    public List<DeploymentCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<DeploymentCondition> conditions) {
      this.conditions = conditions;
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
    
    public Integer getUnavailableReplicas() {
        return this.unavailableReplicas;
    }

    public void setUnavailableReplicas(Integer unavailableReplicas) {
      this.unavailableReplicas = unavailableReplicas;
    }
    
    public Integer getUpdatedReplicas() {
        return this.updatedReplicas;
    }

    public void setUpdatedReplicas(Integer updatedReplicas) {
      this.updatedReplicas = updatedReplicas;
    }
    
}
