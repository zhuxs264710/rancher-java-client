package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class PublicEndpoint extends AbstractType {
    
    private List<String> addresses;
    
    private Boolean allNodes;
    
    private String hostname;
    
    private String ingressId;
    
    private String nodeId;
    
    private String path;
    
    private String podId;
    
    private Integer port;
    
    private String protocol;
    
    private String serviceId;
    
    public List<String> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(List<String> addresses) {
      this.addresses = addresses;
    }
    
    public Boolean getAllNodes() {
        return this.allNodes;
    }

    public void setAllNodes(Boolean allNodes) {
      this.allNodes = allNodes;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public String getIngressId() {
        return this.ingressId;
    }

    public void setIngressId(String ingressId) {
      this.ingressId = ingressId;
    }
    
    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
      this.nodeId = nodeId;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public String getPodId() {
        return this.podId;
    }

    public void setPodId(String podId) {
      this.podId = podId;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
      this.protocol = protocol;
    }
    
    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
    }
    
}
