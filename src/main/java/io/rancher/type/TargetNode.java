package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.TargetNodeConditionEnum;

public class TargetNode extends AbstractType {
    
    private TargetNodeConditionEnum condition;
    
    private Integer cpuThreshold;
    
    private Integer memThreshold;
    
    private String nodeId;
    
    private Map<String, Object> selector;
    
    public TargetNodeConditionEnum getCondition() {
        return this.condition;
    }

    public void setCondition(TargetNodeConditionEnum condition) {
      this.condition = condition;
    }
    
    public Integer getCpuThreshold() {
        return this.cpuThreshold;
    }

    public void setCpuThreshold(Integer cpuThreshold) {
      this.cpuThreshold = cpuThreshold;
    }
    
    public Integer getMemThreshold() {
        return this.memThreshold;
    }

    public void setMemThreshold(Integer memThreshold) {
      this.memThreshold = memThreshold;
    }
    
    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
      this.nodeId = nodeId;
    }
    
    public Map<String, Object> getSelector() {
        return this.selector;
    }

    public void setSelector(Map<String, Object> selector) {
      this.selector = selector;
    }
    
}
