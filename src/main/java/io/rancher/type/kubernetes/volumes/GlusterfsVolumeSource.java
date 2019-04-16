package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class GlusterfsVolumeSource extends AbstractType {
    
    private String endpoints;
    
    private String path;
    
    private Boolean readOnly;
    
    public String getEndpoints() {
        return this.endpoints;
    }

    public void setEndpoints(String endpoints) {
      this.endpoints = endpoints;
    }
    
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
    
}
