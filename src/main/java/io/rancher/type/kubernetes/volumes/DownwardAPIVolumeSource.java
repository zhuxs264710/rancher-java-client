package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;
import io.rancher.type.kubernetes.DownwardAPIVolumeFile;

import java.util.List;

public class DownwardAPIVolumeSource extends AbstractType {
    
    private Integer defaultMode;
    
    private List<DownwardAPIVolumeFile> items;
    
    public Integer getDefaultMode() {
        return this.defaultMode;
    }

    public void setDefaultMode(Integer defaultMode) {
      this.defaultMode = defaultMode;
    }
    
    public List<DownwardAPIVolumeFile> getItems() {
        return this.items;
    }

    public void setItems(List<DownwardAPIVolumeFile> items) {
      this.items = items;
    }
    
}
