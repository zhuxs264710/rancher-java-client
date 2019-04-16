package io.rancher.type;

import io.rancher.base.AbstractType;

public class OsInfo extends AbstractType {
    
    private String dockerVersion;
    
    private String kernelVersion;
    
    private String operatingSystem;
    
    public String getDockerVersion() {
        return this.dockerVersion;
    }

    public void setDockerVersion(String dockerVersion) {
      this.dockerVersion = dockerVersion;
    }
    
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
      this.kernelVersion = kernelVersion;
    }
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
    }
    
}
