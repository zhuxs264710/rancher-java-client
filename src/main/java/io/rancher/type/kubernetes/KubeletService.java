package io.rancher.type.kubernetes;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class KubeletService extends AbstractType {
    
    private String clusterDnsServer;
    
    private String clusterDomain;
    
    private Map<String, Object> extraArgs;
    
    private List<String> extraBinds;
    
    private List<String> extraEnv;
    
    private Boolean failSwapOn;
    
    private String image;
    
    private String infraContainerImage;
    
    public String getClusterDnsServer() {
        return this.clusterDnsServer;
    }

    public void setClusterDnsServer(String clusterDnsServer) {
      this.clusterDnsServer = clusterDnsServer;
    }
    
    public String getClusterDomain() {
        return this.clusterDomain;
    }

    public void setClusterDomain(String clusterDomain) {
      this.clusterDomain = clusterDomain;
    }
    
    public Map<String, Object> getExtraArgs() {
        return this.extraArgs;
    }

    public void setExtraArgs(Map<String, Object> extraArgs) {
      this.extraArgs = extraArgs;
    }
    
    public List<String> getExtraBinds() {
        return this.extraBinds;
    }

    public void setExtraBinds(List<String> extraBinds) {
      this.extraBinds = extraBinds;
    }
    
    public List<String> getExtraEnv() {
        return this.extraEnv;
    }

    public void setExtraEnv(List<String> extraEnv) {
      this.extraEnv = extraEnv;
    }
    
    public Boolean getFailSwapOn() {
        return this.failSwapOn;
    }

    public void setFailSwapOn(Boolean failSwapOn) {
      this.failSwapOn = failSwapOn;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getInfraContainerImage() {
        return this.infraContainerImage;
    }

    public void setInfraContainerImage(String infraContainerImage) {
      this.infraContainerImage = infraContainerImage;
    }
    
}
