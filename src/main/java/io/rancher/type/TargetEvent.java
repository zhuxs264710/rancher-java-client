package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.TargetEventResourceKindEnum;

public class TargetEvent extends AbstractType {
    
    private String eventType;
    
    private TargetEventResourceKindEnum	 resourceKind;
    
    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
      this.eventType = eventType;
    }
    
    public TargetEventResourceKindEnum getResourceKind() {
        return this.resourceKind;
    }

    public void setResourceKind(TargetEventResourceKindEnum resourceKind) {
      this.resourceKind = resourceKind;
    }
    
}
