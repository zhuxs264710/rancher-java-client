package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class AppUpgradeConfig extends AbstractType {
    
    private Map<String, Object> answers;
    
    private String externalId;
    
    public Map<String, Object> getAnswers() {
        return this.answers;
    }

    public void setAnswers(Map<String, Object> answers) {
      this.answers = answers;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
}
