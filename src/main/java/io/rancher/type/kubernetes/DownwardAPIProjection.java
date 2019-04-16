package io.rancher.type.kubernetes;

import io.rancher.base.AbstractType;
import java.util.List;

public class DownwardAPIProjection extends AbstractType {
    
    private List<DownwardAPIVolumeFile> items;
    
    public List<DownwardAPIVolumeFile> getItems() {
        return this.items;
    }

    public void setItems(List<DownwardAPIVolumeFile> items) {
      this.items = items;
    }
    
}
