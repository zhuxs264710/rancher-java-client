package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Probe extends AbstractType {
    
    private List<String> command;
    
    private Integer failureThreshold;
    
    private String host;
    
    private List<HttpHeader> httpHeaders;
    
    private Integer initialDelaySeconds;
    
    private String path;
    
    private Integer periodSeconds;
    
    private Integer port;
    
    private String scheme;
    
    private Integer successThreshold;
    
    private Boolean tcp;
    
    private Integer timeoutSeconds;
    
    public List<String> getCommand() {
        return this.command;
    }

    public void setCommand(List<String> command) {
      this.command = command;
    }
    
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    public void setFailureThreshold(Integer failureThreshold) {
      this.failureThreshold = failureThreshold;
    }
    
    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
      this.host = host;
    }
    
    public List<HttpHeader> getHttpHeaders() {
        return this.httpHeaders;
    }

    public void setHttpHeaders(List<HttpHeader> httpHeaders) {
      this.httpHeaders = httpHeaders;
    }
    
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
      this.initialDelaySeconds = initialDelaySeconds;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
      this.periodSeconds = periodSeconds;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String scheme) {
      this.scheme = scheme;
    }
    
    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }

    public void setSuccessThreshold(Integer successThreshold) {
      this.successThreshold = successThreshold;
    }
    
    public Boolean getTcp() {
        return this.tcp;
    }

    public void setTcp(Boolean tcp) {
      this.tcp = tcp;
    }
    
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
      this.timeoutSeconds = timeoutSeconds;
    }
    
}
