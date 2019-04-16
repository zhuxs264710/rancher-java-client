package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class SubQuestion extends AbstractType {
    
//    private String default;
    
    private String description;
    
    private String group;
    
    private String invalidChars;
    
    private String label;
    
    private Integer max;
    
    private Integer maxLength;
    
    private Integer min;
    
    private Integer minLength;
    
    private List<String> options;
    
    private Boolean required;
    
    private String showIf;
    
    private String type;
    
    private String validChars;
    
    private String variable;
    
//    public String getDefault() {
//        return this.default;
//    }
//
//    public void setDefault(String default) {
//      this.default = default;
//    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
      this.group = group;
    }
    
    public String getInvalidChars() {
        return this.invalidChars;
    }

    public void setInvalidChars(String invalidChars) {
      this.invalidChars = invalidChars;
    }
    
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
      this.label = label;
    }
    
    public Integer getMax() {
        return this.max;
    }

    public void setMax(Integer max) {
      this.max = max;
    }
    
    public Integer getMaxLength() {
        return this.maxLength;
    }

    public void setMaxLength(Integer maxLength) {
      this.maxLength = maxLength;
    }
    
    public Integer getMin() {
        return this.min;
    }

    public void setMin(Integer min) {
      this.min = min;
    }
    
    public Integer getMinLength() {
        return this.minLength;
    }

    public void setMinLength(Integer minLength) {
      this.minLength = minLength;
    }
    
    public List<String> getOptions() {
        return this.options;
    }

    public void setOptions(List<String> options) {
      this.options = options;
    }
    
    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
      this.required = required;
    }
    
    public String getShowIf() {
        return this.showIf;
    }

    public void setShowIf(String showIf) {
      this.showIf = showIf;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public String getValidChars() {
        return this.validChars;
    }

    public void setValidChars(String validChars) {
      this.validChars = validChars;
    }
    
    public String getVariable() {
        return this.variable;
    }

    public void setVariable(String variable) {
      this.variable = variable;
    }
    
}
