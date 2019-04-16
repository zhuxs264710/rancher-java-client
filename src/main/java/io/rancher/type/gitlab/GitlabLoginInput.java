package io.rancher.type.gitlab;

import io.rancher.base.AbstractType;

public class GitlabLoginInput extends AbstractType {
    
    private String code;
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
      this.code = code;
    }
    
}
