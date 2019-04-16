package io.rancher.type.kubernetes;

import io.rancher.base.AbstractType;

public class KubernetesInfo extends AbstractType {
    
    private String kubeProxyVersion;
    
    private String kubeletVersion;
    
    public String getKubeProxyVersion() {
        return this.kubeProxyVersion;
    }

    public void setKubeProxyVersion(String kubeProxyVersion) {
      this.kubeProxyVersion = kubeProxyVersion;
    }
    
    public String getKubeletVersion() {
        return this.kubeletVersion;
    }

    public void setKubeletVersion(String kubeletVersion) {
      this.kubeletVersion = kubeletVersion;
    }
    
}
