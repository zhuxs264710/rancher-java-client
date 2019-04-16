package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class VolumeMount extends AbstractType {
    
    private String mountPath;
    
    private String mountPropagation;
    
    private String name;
    
    private Boolean readOnly;
    
    private String subPath;
    
    public String getMountPath() {
        return this.mountPath;
    }

    public void setMountPath(String mountPath) {
      this.mountPath = mountPath;
    }
    
    public String getMountPropagation() {
        return this.mountPropagation;
    }

    public void setMountPropagation(String mountPropagation) {
      this.mountPropagation = mountPropagation;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public String getSubPath() {
        return this.subPath;
    }

    public void setSubPath(String subPath) {
      this.subPath = subPath;
    }
    
}
