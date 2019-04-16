package io.rancher.type;

import io.rancher.base.AbstractType;

public class Taint extends AbstractType {
    
    private String effect;
    
    private String key;
    
    private String timeAdded;
    
    private String value;
    
    public String getEffect() {
        return this.effect;
    }

    public void setEffect(String effect) {
      this.effect = effect;
    }
    
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
      this.key = key;
    }
    
    public String getTimeAdded() {
        return this.timeAdded;
    }

    public void setTimeAdded(String timeAdded) {
      this.timeAdded = timeAdded;
    }
    
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
      this.value = value;
    }
    
}
