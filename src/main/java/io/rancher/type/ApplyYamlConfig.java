package io.rancher.type;

import io.rancher.base.AbstractType;

public class ApplyYamlConfig extends AbstractType {
    
    private String content;
    
    private String namespace;
    
    private String path;
    
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
      this.content = content;
    }
    
    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
      this.namespace = namespace;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
}
