package io.rancher.type;

import io.rancher.base.AbstractType;

public class BastionHost extends AbstractType {
    
    private String address;
    
    private String port;
    
    private Boolean sshAgentAuth;
    
    private String sshKey;
    
    private String sshKeyPath;
    
    private String user;
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
    
    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
      this.port = port;
    }
    
    public Boolean getSshAgentAuth() {
        return this.sshAgentAuth;
    }

    public void setSshAgentAuth(Boolean sshAgentAuth) {
      this.sshAgentAuth = sshAgentAuth;
    }
    
    public String getSshKey() {
        return this.sshKey;
    }

    public void setSshKey(String sshKey) {
      this.sshKey = sshKey;
    }
    
    public String getSshKeyPath() {
        return this.sshKeyPath;
    }

    public void setSshKeyPath(String sshKeyPath) {
      this.sshKeyPath = sshKeyPath;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
