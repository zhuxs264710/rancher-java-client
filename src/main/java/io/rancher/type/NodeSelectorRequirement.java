package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class NodeSelectorRequirement extends AbstractType {
    
    private String key;
    
    private String operator;
    
    private List<String> values;
    
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
      this.key = key;
    }
    
    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
      this.operator = operator;
    }
    
    public List<String> getValues() {
        return this.values;
    }

    public void setValues(List<String> values) {
      this.values = values;
    }
    
}
