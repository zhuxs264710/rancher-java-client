package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class Step extends AbstractType {
    
    private ApplyYamlConfig applyYamlConfig;
    
    private Map<String, Object> env;
    
    private List<EnvFrom> envFrom;
    
    private Boolean privileged;
    
    private PublishImageConfig publishImageConfig;
    
    private RunScriptConfig runScriptConfig;
    
    private SourceCodeConfig sourceCodeConfig;
    
    private Constraints when;
    
    public ApplyYamlConfig getApplyYamlConfig() {
        return this.applyYamlConfig;
    }

    public void setApplyYamlConfig(ApplyYamlConfig applyYamlConfig) {
      this.applyYamlConfig = applyYamlConfig;
    }
    
    public Map<String, Object> getEnv() {
        return this.env;
    }

    public void setEnv(Map<String, Object> env) {
      this.env = env;
    }
    
    public List<EnvFrom> getEnvFrom() {
        return this.envFrom;
    }

    public void setEnvFrom(List<EnvFrom> envFrom) {
      this.envFrom = envFrom;
    }
    
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public void setPrivileged(Boolean privileged) {
      this.privileged = privileged;
    }
    
    public PublishImageConfig getPublishImageConfig() {
        return this.publishImageConfig;
    }

    public void setPublishImageConfig(PublishImageConfig publishImageConfig) {
      this.publishImageConfig = publishImageConfig;
    }
    
    public RunScriptConfig getRunScriptConfig() {
        return this.runScriptConfig;
    }

    public void setRunScriptConfig(RunScriptConfig runScriptConfig) {
      this.runScriptConfig = runScriptConfig;
    }
    
    public SourceCodeConfig getSourceCodeConfig() {
        return this.sourceCodeConfig;
    }

    public void setSourceCodeConfig(SourceCodeConfig sourceCodeConfig) {
      this.sourceCodeConfig = sourceCodeConfig;
    }
    
    public Constraints getWhen() {
        return this.when;
    }

    public void setWhen(Constraints when) {
      this.when = when;
    }
    
}
