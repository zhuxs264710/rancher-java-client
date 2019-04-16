package io.rancher.type;

import io.rancher.base.AbstractType;

public class EnvFrom extends AbstractType {
    
    private String sourceKey;
    
    private String sourceName;
    
    private String targetKey;
    
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
