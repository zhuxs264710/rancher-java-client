package io.rancher.type;

import io.rancher.base.AbstractType;

public class ObjectReference extends AbstractType {
    
    private String apiVersion;
    
    private String fieldPath;
    
    private String kind;
    
    private String name;
    
    private String namespace;
    
    private String resourceVersion;
    
    private String uid;
    
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
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
      this.namespace = namespace;
    }
    
    public String getResourceVersion() {
        return this.resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
      this.resourceVersion = resourceVersion;
    }
    
    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
      this.uid = uid;
    }
    
}
