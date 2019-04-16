package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class NfsVolumeSource extends AbstractType {
    
    private String path;
    
    private Boolean readOnly;
    
    private String server;
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public String getServer() {
        return this.server;
    }

    public void setServer(String server) {
      this.server = server;
    }
    
}
