package io.rancher.type.kubernetes;

import io.rancher.base.AbstractType;

public class ServicePort extends AbstractType {
    
    private String name;
    
    private Integer nodePort;
    
    private Integer port;
    
    private String protocol;
    
    private Integer targetPort;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Integer getNodePort() {
        return this.nodePort;
    }

    public void setNodePort(Integer nodePort) {
      this.nodePort = nodePort;
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
    
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public void setTargetPort(Integer targetPort) {
      this.targetPort = targetPort;
    }
    
}
