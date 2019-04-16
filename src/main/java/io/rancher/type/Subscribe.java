package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Subscribe extends AbstractType {
    
    private List<String> apiVersions;
    
    private String projectId;
    
    private List<String> resourceTypes;
    
    public List<String> getApiVersions() {
        return this.apiVersions;
    }

    public void setApiVersions(List<String> apiVersions) {
      this.apiVersions = apiVersions;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
      this.resourceTypes = resourceTypes;
    }
    
}
