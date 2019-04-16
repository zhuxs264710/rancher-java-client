package io.rancher.type.cloudprovider.azure;

import io.rancher.base.AbstractType;

public class AzureADConfigApplyInput extends AbstractType {
    
    private String code;
    
    private AzureADConfig config;
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
    public AzureADConfig getConfig() {
        return this.config;
    }

    public void setConfig(AzureADConfig config) {
      this.config = config;
    }
    
}
