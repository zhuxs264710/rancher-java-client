package io.rancher.type;

import io.rancher.base.AbstractType;

public class RunPipelineInput extends AbstractType {
    
    private String branch;
    
    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
      this.branch = branch;
    }
    
}
