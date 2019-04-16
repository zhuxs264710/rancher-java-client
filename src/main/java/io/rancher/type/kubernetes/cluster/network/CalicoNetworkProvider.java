package io.rancher.type.kubernetes.cluster.network;

import io.rancher.base.AbstractType;

public class CalicoNetworkProvider extends AbstractType {
    
    private String cloudProvider;
    
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    public void setCloudProvider(String cloudProvider) {
      this.cloudProvider = cloudProvider;
    }
    
}
