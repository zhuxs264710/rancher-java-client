package io.rancher.type;

import io.rancher.base.AbstractType;

public class ClientIPConfig extends AbstractType {
    
    private Integer timeoutSeconds;
    
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
      this.timeoutSeconds = timeoutSeconds;
    }
    
}
