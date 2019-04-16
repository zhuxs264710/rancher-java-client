package io.rancher.type.kubernetes.cluster.network;

import io.rancher.base.AbstractType;

public class CanalNetworkProvider extends AbstractType {
    
    private String iface;
    
    public String getIface() {
        return this.iface;
    }

    public void setIface(String iface) {
      this.iface = iface;
    }
    
}
