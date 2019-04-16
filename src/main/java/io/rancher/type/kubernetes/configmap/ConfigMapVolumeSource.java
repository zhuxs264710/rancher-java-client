package io.rancher.type.kubernetes.configmap;

import io.rancher.base.AbstractType;
import io.rancher.type.KeyToPath;

import java.util.List;

public class ConfigMapVolumeSource extends AbstractType {
    
    private Integer defaultMode;
    
    private List<KeyToPath> items;
    
    private String name;
    
    private Boolean optional;
    
    public Integer getDefaultMode() {
        return this.defaultMode;
    }

    public void setDefaultMode(Integer defaultMode) {
      this.defaultMode = defaultMode;
    }
    
    public List<KeyToPath> getItems() {
        return this.items;
    }

    public void setItems(List<KeyToPath> items) {
      this.items = items;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Boolean getOptional() {
        return this.optional;
    }

    public void setOptional(Boolean optional) {
      this.optional = optional;
    }
    
}
