package io.rancher.type.kubernetes.cluster.node;

import io.rancher.base.AbstractType;
import java.util.List;

public class NodeScheduling extends AbstractType {
    
    private String nodeId;
    
    private List<String> preferred;
    
    private List<String> requireAll;
    
    private List<String> requireAny;
    
    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
      this.nodeId = nodeId;
    }
    
    public List<String> getPreferred() {
        return this.preferred;
    }

    public void setPreferred(List<String> preferred) {
      this.preferred = preferred;
    }
    
    public List<String> getRequireAll() {
        return this.requireAll;
    }

    public void setRequireAll(List<String> requireAll) {
      this.requireAll = requireAll;
    }
    
    public List<String> getRequireAny() {
        return this.requireAny;
    }

    public void setRequireAny(List<String> requireAny) {
      this.requireAny = requireAny;
    }
    
}
