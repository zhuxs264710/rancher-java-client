package io.rancher.type.github;

import io.rancher.base.AbstractType;

public class GithubPipelineConfigApplyInput extends AbstractType {
    
    private String code;
    
    private GithubPipelineConfig githubConfig;
    
    private Boolean inheritAuth;
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
    public GithubPipelineConfig getGithubConfig() {
        return this.githubConfig;
    }

    public void setGithubConfig(GithubPipelineConfig githubConfig) {
      this.githubConfig = githubConfig;
    }
    
    public Boolean getInheritAuth() {
        return this.inheritAuth;
    }

    public void setInheritAuth(Boolean inheritAuth) {
      this.inheritAuth = inheritAuth;
    }
    
}
