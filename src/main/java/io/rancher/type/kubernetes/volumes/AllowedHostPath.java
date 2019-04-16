package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class AllowedHostPath extends AbstractType {
    
    private String pathPrefix;
    
    public String getPathPrefix() {
        return this.pathPrefix;
    }

    public void setPathPrefix(String pathPrefix) {
      this.pathPrefix = pathPrefix;
    }
    
}
