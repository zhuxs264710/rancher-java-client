package io.rancher.type.project;

import java.util.List;

import io.rancher.base.AbstractType;
import io.rancher.type.kubernetes.volumes.VolumeProjection;

public class ProjectedVolumeSource extends AbstractType {
    
    private Integer defaultMode;
    
    private List<VolumeProjection> sources;
    
    public Integer getDefaultMode() {
        return this.defaultMode;
    }

    public void setDefaultMode(Integer defaultMode) {
      this.defaultMode = defaultMode;
    }
    
    public List<VolumeProjection> getSources() {
        return this.sources;
    }

    public void setSources(List<VolumeProjection> sources) {
      this.sources = sources;
    }
    
}
