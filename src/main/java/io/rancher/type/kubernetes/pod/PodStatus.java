package io.rancher.type.kubernetes.pod;

import java.util.List;

import io.rancher.base.AbstractType;
import io.rancher.type.docker.container.ContainerStatus;

public class PodStatus extends AbstractType {
    
    private List<PodCondition> conditions;
    
    private List<ContainerStatus> containerStatuses;
    
    private List<ContainerStatus> initContainerStatuses;
    
    private String message;
    
    private String nodeIp;
    
    private String nominatedNodeName;
    
    private String phase;
    
    private String podIp;
    
    private String qosClass;
    
    private String reason;
    
    private String startTime;
    
    public List<PodCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<PodCondition> conditions) {
      this.conditions = conditions;
    }
    
    public List<ContainerStatus> getContainerStatuses() {
        return this.containerStatuses;
    }

    public void setContainerStatuses(List<ContainerStatus> containerStatuses) {
      this.containerStatuses = containerStatuses;
    }
    
    public List<ContainerStatus> getInitContainerStatuses() {
        return this.initContainerStatuses;
    }

    public void setInitContainerStatuses(List<ContainerStatus> initContainerStatuses) {
      this.initContainerStatuses = initContainerStatuses;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public String getNodeIp() {
        return this.nodeIp;
    }

    public void setNodeIp(String nodeIp) {
      this.nodeIp = nodeIp;
    }
    
    public String getNominatedNodeName() {
        return this.nominatedNodeName;
    }

    public void setNominatedNodeName(String nominatedNodeName) {
      this.nominatedNodeName = nominatedNodeName;
    }
    
    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
      this.phase = phase;
    }
    
    public String getPodIp() {
        return this.podIp;
    }

    public void setPodIp(String podIp) {
      this.podIp = podIp;
    }
    
    public String getQosClass() {
        return this.qosClass;
    }

    public void setQosClass(String qosClass) {
      this.qosClass = qosClass;
    }
    
    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
      this.reason = reason;
    }
    
    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
      this.startTime = startTime;
    }
    
}
