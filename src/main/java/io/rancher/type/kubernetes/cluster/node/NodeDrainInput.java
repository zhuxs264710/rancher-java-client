package io.rancher.type.kubernetes.cluster.node;

import io.rancher.base.AbstractType;

public class NodeDrainInput extends AbstractType {
    
    private Boolean deleteLocalData;
    
    private Boolean force;
    
    private Integer gracePeriod;
    
    private Boolean ignoreDaemonSets;
    
    private Integer timeout;
    
    public Boolean getDeleteLocalData() {
        return this.deleteLocalData;
    }

    public void setDeleteLocalData(Boolean deleteLocalData) {
      this.deleteLocalData = deleteLocalData;
    }
    
    public Boolean getForce() {
        return this.force;
    }

    public void setForce(Boolean force) {
      this.force = force;
    }
    
    public Integer getGracePeriod() {
        return this.gracePeriod;
    }

    public void setGracePeriod(Integer gracePeriod) {
      this.gracePeriod = gracePeriod;
    }
    
    public Boolean getIgnoreDaemonSets() {
        return this.ignoreDaemonSets;
    }

    public void setIgnoreDaemonSets(Boolean ignoreDaemonSets) {
      this.ignoreDaemonSets = ignoreDaemonSets;
    }
    
    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
      this.timeout = timeout;
    }
    
}
