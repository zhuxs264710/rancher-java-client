package io.rancher.type.github;

import io.rancher.base.AbstractType;

public class GithubConfigApplyInput extends AbstractType {
    
    private String code;
    
    private Boolean enabled;
    
    private GithubConfig githubConfig;
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public GithubConfig getGithubConfig() {
        return this.githubConfig;
    }

    public void setGithubConfig(GithubConfig githubConfig) {
      this.githubConfig = githubConfig;
    }
    
}
