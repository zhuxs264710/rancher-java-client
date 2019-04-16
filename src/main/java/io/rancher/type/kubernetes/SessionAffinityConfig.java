package io.rancher.type.kubernetes;

import io.rancher.base.AbstractType;
import io.rancher.type.ClientIPConfig;

public class SessionAffinityConfig extends AbstractType {
    
    private ClientIPConfig clientIP;
    
    public ClientIPConfig getClientIP() {
        return this.clientIP;
    }

    public void setClientIP(ClientIPConfig clientIP) {
      this.clientIP = clientIP;
    }
    
}
