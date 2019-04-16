package io.rancher.type.github;

import io.rancher.base.AbstractType;

public class GithubLoginInput extends AbstractType {
    
    private String code;
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
}
