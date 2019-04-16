package io.rancher.type.gitlab;

import io.rancher.base.AbstractType;

public class GitlabPipelineConfigApplyInput extends AbstractType {
    
    private String code;
    
    private GitlabPipelineConfig gitlabConfig;
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
    public GitlabPipelineConfig getGitlabConfig() {
        return this.gitlabConfig;
    }

    public void setGitlabConfig(GitlabPipelineConfig gitlabConfig) {
      this.gitlabConfig = gitlabConfig;
    }
    
}
