package io.rancher.type;

import io.rancher.base.AbstractType;

public class ObjectFieldSelector extends AbstractType {
    
    private String apiVersion;
    
    private String fieldPath;
    
    public String getApiVersion() {
        return this.apiVersion;
    }

    public void setApiVersion(String apiVersion) {
      this.apiVersion = apiVersion;
    }
    
    public String getFieldPath() {
        return this.fieldPath;
    }

    public void setFieldPath(String fieldPath) {
      this.fieldPath = fieldPath;
    }
    
}
