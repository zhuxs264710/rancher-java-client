package io.rancher.type;

import io.rancher.base.AbstractType;

public class DiskVsphereOpts extends AbstractType {
    
    private String scsicontrollertype;
    
    public String getScsicontrollertype() {
        return this.scsicontrollertype;
    }

    public void setScsicontrollertype(String scsicontrollertype) {
      this.scsicontrollertype = scsicontrollertype;
    }
    
}
