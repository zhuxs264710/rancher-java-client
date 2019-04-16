package io.rancher.type.github;

import io.rancher.base.AbstractType;

public class GithubConfigTestOutput extends AbstractType {
    
    private String redirectUrl;
    
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
      this.redirectUrl = redirectUrl;
    }
    
}
