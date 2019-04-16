package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class AllowedFlexVolume extends AbstractType {
    
    private String driver;
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
}
