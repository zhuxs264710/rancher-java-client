package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;
import io.rancher.type.KeyToPath;

import java.util.List;

public class SecretVolumeSource extends AbstractType {
    
    private Integer defaultMode;
    
    private List<KeyToPath> items;
    
    private Boolean optional;
    
    private String secretName;
    
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
    
    public Boolean getOptional() {
        return this.optional;
    }

    public void setOptional(Boolean optional) {
      this.optional = optional;
    }
    
    public String getSecretName() {
        return this.secretName;
    }

    public void setSecretName(String secretName) {
      this.secretName = secretName;
    }
    
}
