package io.rancher.type.kubernetes.deployment;

import io.rancher.base.AbstractType;

public class DeploymentRollbackInput extends AbstractType {
    
    private String replicaSetId;
    
    public String getReplicaSetId() {
        return this.replicaSetId;
    }

    public void setReplicaSetId(String replicaSetId) {
      this.replicaSetId = replicaSetId;
    }
    
}
