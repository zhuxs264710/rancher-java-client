package io.rancher.type.kubernetes;

import io.rancher.base.AbstractType;
import java.util.List;

public class HostAlias extends AbstractType {
    
    private List<String> hostnames;
    
    private String ip;
    
    public List<String> getHostnames() {
        return this.hostnames;
    }

    public void setHostnames(List<String> hostnames) {
      this.hostnames = hostnames;
    }
    
    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
      this.ip = ip;
    }
    
}
