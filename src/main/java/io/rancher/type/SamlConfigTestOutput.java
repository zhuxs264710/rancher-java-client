package io.rancher.type;

import io.rancher.base.AbstractType;

public class SamlConfigTestOutput extends AbstractType {
    
    private String idpRedirectUrl;
    
    public String getIdpRedirectUrl() {
        return this.idpRedirectUrl;
    }

    public void setIdpRedirectUrl(String idpRedirectUrl) {
      this.idpRedirectUrl = idpRedirectUrl;
    }
    
}
