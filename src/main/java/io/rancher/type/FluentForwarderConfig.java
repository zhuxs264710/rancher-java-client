package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class FluentForwarderConfig extends AbstractType {
    
    private String certificate;
    
    private Boolean compress;
    
    private Boolean enableTls;
    
    private List<FluentServer> fluentServers;
    
    public String getCertificate() {
        return this.certificate;
    }

    public void setCertificate(String certificate) {
      this.certificate = certificate;
    }
    
    public Boolean getCompress() {
        return this.compress;
    }

    public void setCompress(Boolean compress) {
      this.compress = compress;
    }
    
    public Boolean getEnableTls() {
        return this.enableTls;
    }

    public void setEnableTls(Boolean enableTls) {
      this.enableTls = enableTls;
    }
    
    public List<FluentServer> getFluentServers() {
        return this.fluentServers;
    }

    public void setFluentServers(List<FluentServer> fluentServers) {
      this.fluentServers = fluentServers;
    }
    
}
