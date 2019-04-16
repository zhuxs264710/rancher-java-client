package io.rancher.type;

import io.rancher.base.AbstractType;

public class RunScriptConfig extends AbstractType {
    
    private String image;
    
    private String shellScript;
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getShellScript() {
        return this.shellScript;
    }

    public void setShellScript(String shellScript) {
      this.shellScript = shellScript;
    }
    
}
