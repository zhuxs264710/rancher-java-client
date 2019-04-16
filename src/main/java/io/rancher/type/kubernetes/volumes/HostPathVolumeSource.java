package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.HostPathVolumeSourceKindEnum;

public class HostPathVolumeSource extends AbstractType {
    
    private HostPathVolumeSourceKindEnum kind;
    
    private String path;
    
    public HostPathVolumeSourceKindEnum getKind() {
        return this.kind;
    }

    public void setKind(HostPathVolumeSourceKindEnum kind) {
      this.kind = kind;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
}
