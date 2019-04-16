package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.EnvironmentFromSourceEnum;

public class EnvironmentFrom extends AbstractType {
    
    private Boolean optional;
    
    private String prefix;
    
    private EnvironmentFromSourceEnum source;
    
    private String sourceKey;
    
    private String sourceName;
    
    private String targetKey;
    
    public Boolean getOptional() {
        return this.optional;
    }

    public void setOptional(Boolean optional) {
      this.optional = optional;
    }
    
    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
      this.prefix = prefix;
    }
    
    public EnvironmentFromSourceEnum getSource() {
        return this.source;
    }

    public void setSource(EnvironmentFromSourceEnum source) {
      this.source = source;
    }
    
    public String getSourceKey() {
        return this.sourceKey;
    }

    public void setSourceKey(String sourceKey) {
      this.sourceKey = sourceKey;
    }
    
    public String getSourceName() {
        return this.sourceName;
    }

    public void setSourceName(String sourceName) {
      this.sourceName = sourceName;
    }
    
    public String getTargetKey() {
        return this.targetKey;
    }

    public void setTargetKey(String targetKey) {
      this.targetKey = targetKey;
    }
    
}
