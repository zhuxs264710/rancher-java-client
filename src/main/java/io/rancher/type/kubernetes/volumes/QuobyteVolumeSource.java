package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class QuobyteVolumeSource extends AbstractType {
    
    private String group;
    
    private Boolean readOnly;
    
    private String registry;
    
    private String user;
    
    private String volume;
    
    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
      this.group = group;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public String getRegistry() {
        return this.registry;
    }

    public void setRegistry(String registry) {
      this.registry = registry;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
    public String getVolume() {
        return this.volume;
    }

    public void setVolume(String volume) {
      this.volume = volume;
    }
    
}
