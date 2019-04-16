package io.rancher.type;

import io.rancher.base.AbstractType;

public class GenerateKubeConfigOutput extends AbstractType {
    
    private String config;
    
    public String getConfig() {
        return this.config;
    }

    public void setConfig(String config) {
      this.config = config;
    }
    
}
