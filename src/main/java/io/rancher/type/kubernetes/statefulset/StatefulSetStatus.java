package io.rancher.type.kubernetes.statefulset;

import io.rancher.base.AbstractType;
import java.util.List;

public class StatefulSetStatus extends AbstractType {
    
    private Integer collisionCount;
    
    private List<StatefulSetCondition> conditions;
    
    private Integer currentReplicas;
    
    private String currentRevision;
    
    private Integer observedGeneration;
    
    private Integer readyReplicas;
    
    private Integer replicas;
    
    private String updateRevision;
    
    private Integer updatedReplicas;
    
    public Integer getCollisionCount() {
        return this.collisionCount;
    }

    public void setCollisionCount(Integer collisionCount) {
      this.collisionCount = collisionCount;
    }
    
    public List<StatefulSetCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<StatefulSetCondition> conditions) {
      this.conditions = conditions;
    }
    
    public Integer getCurrentReplicas() {
        return this.currentReplicas;
    }

    public void setCurrentReplicas(Integer currentReplicas) {
      this.currentReplicas = currentReplicas;
    }
    
    public String getCurrentRevision() {
        return this.currentRevision;
    }

    public void setCurrentRevision(String currentRevision) {
      this.currentRevision = currentRevision;
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
    
    public String getUpdateRevision() {
        return this.updateRevision;
    }

    public void setUpdateRevision(String updateRevision) {
      this.updateRevision = updateRevision;
    }
    
    public Integer getUpdatedReplicas() {
        return this.updatedReplicas;
    }

    public void setUpdatedReplicas(Integer updatedReplicas) {
      this.updatedReplicas = updatedReplicas;
    }
    
}
