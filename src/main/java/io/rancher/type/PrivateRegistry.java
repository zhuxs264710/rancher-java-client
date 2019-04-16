package io.rancher.type;

import io.rancher.base.AbstractType;

public class PrivateRegistry extends AbstractType {
    
    private Boolean isDefault;
    
    private String String;
    
    private String url;
    
    private String user;
    
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
      this.isDefault = isDefault;
    }
    
    public String getString() {
        return this.String;
    }

    public void setString(String String) {
      this.String = String;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
