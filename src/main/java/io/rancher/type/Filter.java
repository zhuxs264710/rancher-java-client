package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Filter extends AbstractType {
    
    private List<String> modifiers;
    
    public List<String> getModifiers() {
        return this.modifiers;
    }

    public void setModifiers(List<String> modifiers) {
      this.modifiers = modifiers;
    }
    
}
