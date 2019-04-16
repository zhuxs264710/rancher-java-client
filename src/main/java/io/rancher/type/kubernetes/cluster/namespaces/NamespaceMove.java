package io.rancher.type.kubernetes.cluster.namespaces;

import io.rancher.base.AbstractType;

public class NamespaceMove extends AbstractType {
    
    private String projectId;
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
}
