package io.rancher.type;

import io.rancher.base.AbstractType;

public class LoadBalancerIngress extends AbstractType {
    
    private String hostname;
    
    private String ip;
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
      this.ip = ip;
    }
    
}
