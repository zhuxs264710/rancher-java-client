package io.rancher.type.kubernetes;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class KubeAPIService extends AbstractType {
    
    private Map<String, Object> extraArgs;
    
    private List<String> extraBinds;
    
    private List<String> extraEnv;
    
    private String image;
    
    private Boolean podSecurityPolicy;
    
    private String serviceClusterIpRange;
    
    private String serviceNodePortRange;
    
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
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public Boolean getPodSecurityPolicy() {
        return this.podSecurityPolicy;
    }

    public void setPodSecurityPolicy(Boolean podSecurityPolicy) {
      this.podSecurityPolicy = podSecurityPolicy;
    }
    
    public String getServiceClusterIpRange() {
        return this.serviceClusterIpRange;
    }

    public void setServiceClusterIpRange(String serviceClusterIpRange) {
      this.serviceClusterIpRange = serviceClusterIpRange;
    }
    
    public String getServiceNodePortRange() {
        return this.serviceNodePortRange;
    }

    public void setServiceNodePortRange(String serviceNodePortRange) {
      this.serviceNodePortRange = serviceNodePortRange;
    }
    
}
