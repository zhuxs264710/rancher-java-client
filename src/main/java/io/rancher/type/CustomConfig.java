package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class CustomConfig extends AbstractType {
    
    private String address;
    
    private String dockerSocket;
    
    private String internalAddress;
    
    private Map<String, Object> label;
    
    private String sshKey;
    
    private String user;
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
    
    public String getDockerSocket() {
        return this.dockerSocket;
    }

    public void setDockerSocket(String dockerSocket) {
      this.dockerSocket = dockerSocket;
    }
    
    public String getInternalAddress() {
        return this.internalAddress;
    }

    public void setInternalAddress(String internalAddress) {
      this.internalAddress = internalAddress;
    }
    
    public Map<String, Object> getLabel() {
        return this.label;
    }

    public void setLabel(Map<String, Object> label) {
      this.label = label;
    }
    
    public String getSshKey() {
        return this.sshKey;
    }

    public void setSshKey(String sshKey) {
      this.sshKey = sshKey;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
