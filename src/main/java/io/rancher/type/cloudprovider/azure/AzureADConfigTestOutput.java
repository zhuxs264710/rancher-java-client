package io.rancher.type.cloudprovider.azure;

import io.rancher.base.AbstractType;

public class AzureADConfigTestOutput extends AbstractType {
    
    private String redirectUrl;
    
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
    }
    
}
