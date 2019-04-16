package io.rancher.type;

import io.rancher.base.AbstractType;

public class ImportClusterYamlInput extends AbstractType {
    
    private String defaultNamespace;
    
    private String namespace;
    
    private String projectId;
    
    private String yaml;
    
    public String getDefaultNamespace() {
        return this.defaultNamespace;
    }

    public void setDefaultNamespace(String defaultNamespace) {
      this.defaultNamespace = defaultNamespace;
    }
    
    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
      this.namespace = namespace;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getYaml() {
        return this.yaml;
    }

    public void setYaml(String yaml) {
      this.yaml = yaml;
    }
    
}
