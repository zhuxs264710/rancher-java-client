package io.rancher.type;

import io.rancher.base.AbstractType;

public class RegistryCredential extends AbstractType {
    
    private String auth;
    
    private String description;
    
    private String password;
    
    private String username;
    
    public String getAuth() {
        return this.auth;
    }

    public void setAuth(String auth) {
      this.auth = auth;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
}
