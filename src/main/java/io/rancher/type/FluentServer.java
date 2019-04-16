package io.rancher.type;

import io.rancher.base.AbstractType;

public class FluentServer extends AbstractType {
    
    private String endpoint;
    
    private String hostname;
    
    private String password;
    
    private String sharedKey;
    
    private Boolean standby;
    
    private String username;
    
    private Integer weight;
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getSharedKey() {
        return this.sharedKey;
    }

    public void setSharedKey(String sharedKey) {
      this.sharedKey = sharedKey;
    }
    
    public Boolean getStandby() {
        return this.standby;
    }

    public void setStandby(Boolean standby) {
      this.standby = standby;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
      this.weight = weight;
    }
    
}
