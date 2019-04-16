package io.rancher.type.kubernetes.cluster.network;

import io.rancher.base.AbstractType;

import java.util.Map;

public class NetworkConfig extends AbstractType {
    
    private CalicoNetworkProvider calicoNetworkProvider;
    
    private CanalNetworkProvider canalNetworkProvider;
    
    private FlannelNetworkProvider flannelNetworkProvider;
    
    private Map<String, Object> options;
    
    private String plugin;
    
    public CalicoNetworkProvider getCalicoNetworkProvider() {
        return this.calicoNetworkProvider;
    }

    public void setCalicoNetworkProvider(CalicoNetworkProvider calicoNetworkProvider) {
      this.calicoNetworkProvider = calicoNetworkProvider;
    }
    
    public CanalNetworkProvider getCanalNetworkProvider() {
        return this.canalNetworkProvider;
    }

    public void setCanalNetworkProvider(CanalNetworkProvider canalNetworkProvider) {
      this.canalNetworkProvider = canalNetworkProvider;
    }
    
    public FlannelNetworkProvider getFlannelNetworkProvider() {
        return this.flannelNetworkProvider;
    }

    public void setFlannelNetworkProvider(FlannelNetworkProvider flannelNetworkProvider) {
      this.flannelNetworkProvider = flannelNetworkProvider;
    }
    
    public Map<String, Object> getOptions() {
        return this.options;
    }

    public void setOptions(Map<String, Object> options) {
      this.options = options;
    }
    
    public String getPlugin() {
        return this.plugin;
    }

    public void setPlugin(String plugin) {
      this.plugin = plugin;
    }
    
}
