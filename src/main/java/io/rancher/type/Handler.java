package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Handler extends AbstractType {
    
    private List<String> command;
    
    private String host;
    
    private List<HttpHeader> httpHeaders;
    
    private String path;
    
    private Integer port;
    
    private String scheme;
    
    private Boolean tcp;
    
    public List<String> getCommand() {
        return this.command;
    }

    public void setCommand(List<String> command) {
      this.command = command;
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
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
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
    
    public Boolean getTcp() {
        return this.tcp;
    }

    public void setTcp(Boolean tcp) {
      this.tcp = tcp;
    }
    
}
