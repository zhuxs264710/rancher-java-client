package io.rancher.type;

import io.rancher.base.AbstractType;

public class ExportOutput extends AbstractType {
    
    private String yamlOutput;
    
    public String getYamlOutput() {
        return this.yamlOutput;
    }

    public void setYamlOutput(String yamlOutput) {
      this.yamlOutput = yamlOutput;
    }
    
}
