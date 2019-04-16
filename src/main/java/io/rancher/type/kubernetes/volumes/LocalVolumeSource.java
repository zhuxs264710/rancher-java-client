package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class LocalVolumeSource extends AbstractType {
    
    private String path;
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
}
