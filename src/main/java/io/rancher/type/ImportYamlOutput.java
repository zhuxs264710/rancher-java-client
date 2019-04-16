package io.rancher.type;

import io.rancher.base.AbstractType;

public class ImportYamlOutput extends AbstractType {
    
    private String message;
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
}
