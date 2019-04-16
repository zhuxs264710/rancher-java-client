package io.rancher.type.kubernetes.ingress;

import io.rancher.base.AbstractType;
import java.util.List;

public class IngressTLS extends AbstractType {
    
    private String certificateId;
    
    private List<String> hosts;
    
    public String getCertificateId() {
        return this.certificateId;
    }

    public void setCertificateId(String certificateId) {
      this.certificateId = certificateId;
    }
    
    public List<String> getHosts() {
        return this.hosts;
    }

    public void setHosts(List<String> hosts) {
      this.hosts = hosts;
    }
    
}
