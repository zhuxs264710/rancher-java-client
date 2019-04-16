package io.rancher.type;

import io.rancher.base.AbstractType;

public class ImportedConfig extends AbstractType {
    
    private String kubeConfig;
    
    public String getKubeConfig() {
        return this.kubeConfig;
    }

    public void setKubeConfig(String kubeConfig) {
      this.kubeConfig = kubeConfig;
    }
    
}
