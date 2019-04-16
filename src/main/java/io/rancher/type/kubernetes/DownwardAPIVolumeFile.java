package io.rancher.type.kubernetes;

import io.rancher.base.AbstractType;
import io.rancher.type.ObjectFieldSelector;
import io.rancher.type.ResourceFieldSelector;

public class DownwardAPIVolumeFile extends AbstractType {
    
    private ObjectFieldSelector fieldRef;
    
    private Integer mode;
    
    private String path;
    
    private ResourceFieldSelector resourceFieldRef;
    
    public ObjectFieldSelector getFieldRef() {
        return this.fieldRef;
    }

    public void setFieldRef(ObjectFieldSelector fieldRef) {
      this.fieldRef = fieldRef;
    }
    
    public Integer getMode() {
        return this.mode;
    }

    public void setMode(Integer mode) {
      this.mode = mode;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public ResourceFieldSelector getResourceFieldRef() {
        return this.resourceFieldRef;
    }

    public void setResourceFieldRef(ResourceFieldSelector resourceFieldRef) {
      this.resourceFieldRef = resourceFieldRef;
    }
    
}
