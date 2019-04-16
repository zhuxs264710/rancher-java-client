package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class PolicyRule extends AbstractType {
    
    private List<String> apiGroups;
    
    private List<String> nonResourceURLs;
    
    private List<String> resourceNames;
    
    private List<String> resources;
    
    private List<String> verbs;
    
    public List<String> getApiGroups() {
        return this.apiGroups;
    }

    public void setApiGroups(List<String> apiGroups) {
      this.apiGroups = apiGroups;
    }
    
    public List<String> getNonResourceURLs() {
        return this.nonResourceURLs;
    }

    public void setNonResourceURLs(List<String> nonResourceURLs) {
      this.nonResourceURLs = nonResourceURLs;
    }
    
    public List<String> getResourceNames() {
        return this.resourceNames;
    }

    public void setResourceNames(List<String> resourceNames) {
      this.resourceNames = resourceNames;
    }
    
    public List<String> getResources() {
        return this.resources;
    }

    public void setResources(List<String> resources) {
      this.resources = resources;
    }
    
    public List<String> getVerbs() {
        return this.verbs;
    }

    public void setVerbs(List<String> verbs) {
      this.verbs = verbs;
    }
    
}
