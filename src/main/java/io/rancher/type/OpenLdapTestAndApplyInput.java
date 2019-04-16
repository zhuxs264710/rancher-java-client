package io.rancher.type;

import io.rancher.base.AbstractType;

public class OpenLdapTestAndApplyInput extends AbstractType {
    
    private LdapConfig ldapConfig;
    
    private String String;
    
    private String username;
    
    public LdapConfig getLdapConfig() {
        return this.ldapConfig;
    }

    public void setLdapConfig(LdapConfig ldapConfig) {
      this.ldapConfig = ldapConfig;
    }
    
    public String getString() {
        return this.String;
    }

    public void setString(String String) {
      this.String = String;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
}
