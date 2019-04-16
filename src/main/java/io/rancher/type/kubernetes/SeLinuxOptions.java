package io.rancher.type.kubernetes;

import io.rancher.base.AbstractType;

public class SeLinuxOptions extends AbstractType {
    
    private String level;
    
    private String role;
    
    private String type;
    
    private String user;
    
    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
      this.level = level;
    }
    
    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
      this.role = role;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
