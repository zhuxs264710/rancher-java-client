package io.rancher.type.docker.container;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.ContainerPortKindEnum;

public class ContainerPort extends AbstractType {
    
    private Integer containerPort;
    
    private String dnsName;
    
    private String hostIp;
    
    private ContainerPortKindEnum kind;
    
    private String name;
    
    private String protocol;
    
    private Integer sourcePort;
    
    public Integer getContainerPort() {
        return this.containerPort;
    }

    public void setContainerPort(Integer containerPort) {
      this.containerPort = containerPort;
    }
    
    public String getDnsName() {
        return this.dnsName;
    }

    public void setDnsName(String dnsName) {
      this.dnsName = dnsName;
    }
    
    public String getHostIp() {
        return this.hostIp;
    }

    public void setHostIp(String hostIp) {
      this.hostIp = hostIp;
    }
    
    public ContainerPortKindEnum getKind() {
        return this.kind;
    }

    public void setKind(ContainerPortKindEnum kind) {
      this.kind = kind;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
      this.protocol = protocol;
    }
    
    public Integer getSourcePort() {
        return this.sourcePort;
    }

    public void setSourcePort(Integer sourcePort) {
      this.sourcePort = sourcePort;
    }
    
}
