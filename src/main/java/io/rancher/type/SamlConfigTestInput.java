package io.rancher.type;

import io.rancher.base.AbstractType;

public class SamlConfigTestInput extends AbstractType {
    
    private String finalRedirectUrl;
    
    public String getFinalRedirectUrl() {
        return this.finalRedirectUrl;
    }

    public void setFinalRedirectUrl(String finalRedirectUrl) {
      this.finalRedirectUrl = finalRedirectUrl;
    }
    
}
