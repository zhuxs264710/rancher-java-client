package io.rancher.type;

import io.rancher.base.AbstractType;

public class Info extends AbstractType {
    
    private String buildDate;
    
    private String compiler;
    
    private String gitCommit;
    
    private String gitTreeState;
    
    private String gitVersion;
    
    private String goVersion;
    
    private String major;
    
    private String minor;
    
    private String platform;
    
    public String getBuildDate() {
        return this.buildDate;
    }

    public void setBuildDate(String buildDate) {
      this.buildDate = buildDate;
    }
    
    public String getCompiler() {
        return this.compiler;
    }

    public void setCompiler(String compiler) {
      this.compiler = compiler;
    }
    
    public String getGitCommit() {
        return this.gitCommit;
    }

    public void setGitCommit(String gitCommit) {
      this.gitCommit = gitCommit;
    }
    
    public String getGitTreeState() {
        return this.gitTreeState;
    }

    public void setGitTreeState(String gitTreeState) {
      this.gitTreeState = gitTreeState;
    }
    
    public String getGitVersion() {
        return this.gitVersion;
    }

    public void setGitVersion(String gitVersion) {
      this.gitVersion = gitVersion;
    }
    
    public String getGoVersion() {
        return this.goVersion;
    }

    public void setGoVersion(String goVersion) {
      this.goVersion = goVersion;
    }
    
    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
      this.major = major;
    }
    
    public String getMinor() {
        return this.minor;
    }

    public void setMinor(String minor) {
      this.minor = minor;
    }
    
    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
      this.platform = platform;
    }
    
}
