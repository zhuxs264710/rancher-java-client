package io.rancher.type;

import java.util.List;

import io.rancher.base.AbstractType;
import io.rancher.type.kubernetes.cluster.node.NodeScheduling;

public class Scheduling extends AbstractType {
    
    private NodeScheduling node;
    
    private Integer priority;
    
    private String priorityClassName;
    
    private String scheduler;
    
    private List<Toleration> tolerate;
    
    public NodeScheduling getNode() {
        return this.node;
    }

    public void setNode(NodeScheduling node) {
      this.node = node;
    }
    
    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
      this.priority = priority;
    }
    
    public String getPriorityClassName() {
        return this.priorityClassName;
    }

    public void setPriorityClassName(String priorityClassName) {
      this.priorityClassName = priorityClassName;
    }
    
    public String getScheduler() {
        return this.scheduler;
    }

    public void setScheduler(String scheduler) {
      this.scheduler = scheduler;
    }
    
    public List<Toleration> getTolerate() {
        return this.tolerate;
    }

    public void setTolerate(List<Toleration> tolerate) {
      this.tolerate = tolerate;
    }
    
}
