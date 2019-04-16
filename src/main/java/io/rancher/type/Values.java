package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Values extends AbstractType {
    
    private Boolean boolValue;
    
    private Integer intValue;
    
    private List<String> stringSliceValue;
    
    private String stringValue;
    
    public Boolean getBoolValue() {
        return this.boolValue;
    }

    public void setBoolValue(Boolean boolValue) {
      this.boolValue = boolValue;
    }
    
    public Integer getIntValue() {
        return this.intValue;
    }

    public void setIntValue(Integer intValue) {
      this.intValue = intValue;
    }
    
    public List<String> getStringSliceValue() {
        return this.stringSliceValue;
    }

    public void setStringSliceValue(List<String> stringSliceValue) {
      this.stringSliceValue = stringSliceValue;
    }
    
    public String getStringValue() {
        return this.stringValue;
    }

    public void setStringValue(String stringValue) {
      this.stringValue = stringValue;
    }
    
}
