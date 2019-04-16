package io.rancher.type;

import io.rancher.base.AbstractType;

public class DynamicSchemaStatus extends AbstractType {
    
    private String fake;
    
    public String getFake() {
        return this.fake;
    }

    public void setFake(String fake) {
      this.fake = fake;
    }
    
}
