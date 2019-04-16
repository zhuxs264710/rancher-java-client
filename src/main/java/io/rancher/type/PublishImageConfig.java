package io.rancher.type;

import io.rancher.base.AbstractType;

public class PublishImageConfig extends AbstractType {
    
    private String buildContext;
    
    private String dockerfilePath;
    
    private Boolean pushRemote;
    
    private String registry;
    
    private String tag;
    
    public String getBuildContext() {
        return this.buildContext;
    }

    public void setBuildContext(String buildContext) {
      this.buildContext = buildContext;
    }
    
    public String getDockerfilePath() {
        return this.dockerfilePath;
    }

    public void setDockerfilePath(String dockerfilePath) {
      this.dockerfilePath = dockerfilePath;
    }
    
    public Boolean getPushRemote() {
        return this.pushRemote;
    }

    public void setPushRemote(Boolean pushRemote) {
      this.pushRemote = pushRemote;
    }
    
    public String getRegistry() {
        return this.registry;
    }

    public void setRegistry(String registry) {
      this.registry = registry;
    }
    
    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
      this.tag = tag;
    }
    
}
