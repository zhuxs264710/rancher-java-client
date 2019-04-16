package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class VolumeDevice extends AbstractType {
    
    private String devicePath;
    
    private String name;
    
    public String getDevicePath() {
        return this.devicePath;
    }

    public void setDevicePath(String devicePath) {
      this.devicePath = devicePath;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}
