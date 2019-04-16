package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.SyslogConfigProtocolEnum;
import io.rancher.model.enums.SyslogConfigSeverityEnum;

public class SyslogConfig extends AbstractType {
    
    private String certificate;
    
    private String clientCert;
    
    private String clientKey;
    
    private String endpoint;
    
    private String program;
    
    private SyslogConfigProtocolEnum protocol;
    
    private SyslogConfigSeverityEnum severity;
    
    private Boolean sslVerify;
    
    private String token;
    
    public String getCertificate() {
        return this.certificate;
    }

    public void setCertificate(String certificate) {
      this.certificate = certificate;
    }
    
    public String getClientCert() {
        return this.clientCert;
    }

    public void setClientCert(String clientCert) {
      this.clientCert = clientCert;
    }
    
    public String getClientKey() {
        return this.clientKey;
    }

    public void setClientKey(String clientKey) {
      this.clientKey = clientKey;
    }
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
      this.program = program;
    }
    
    public SyslogConfigProtocolEnum getProtocol() {
        return this.protocol;
    }

    public void setProtocol(SyslogConfigProtocolEnum protocol) {
      this.protocol = protocol;
    }
    
    public SyslogConfigSeverityEnum getSeverity() {
        return this.severity;
    }

    public void setSeverity(SyslogConfigSeverityEnum severity) {
      this.severity = severity;
    }
    
    public Boolean getSslVerify() {
        return this.sslVerify;
    }

    public void setSslVerify(Boolean sslVerify) {
      this.sslVerify = sslVerify;
    }
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
    }
    
}
