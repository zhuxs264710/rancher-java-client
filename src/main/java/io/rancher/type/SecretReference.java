package io.rancher.type;

import io.rancher.base.AbstractType;

public class SecretReference extends AbstractType {
    
    private String name;
    
    private String namespace;
    
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
    
}
