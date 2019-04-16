package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Field extends AbstractType {
    
    private Boolean create;
    
//    private Values default;
    
    private String description;
    
    private String invalidChars;
    
    private Integer max;
    
    private Integer maxLength;
    
    private Integer min;
    
    private Integer minLength;
    
    private Boolean nullable;
    
    private List<String> options;
    
    private Boolean required;
    
    private String type;
    
    private Boolean unique;
    
    private Boolean update;
    
    private String validChars;
    
    public Boolean getCreate() {
        return this.create;
    }

    public void setCreate(Boolean create) {
      this.create = create;
    }
    
//    public Values getDefault() {
//        return this.default;
//    }
//
//    public void setDefault(Values default) {
//      this.default = default;
//    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getInvalidChars() {
        return this.invalidChars;
    }

    public void setInvalidChars(String invalidChars) {
      this.invalidChars = invalidChars;
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
    
    public Boolean getNullable() {
        return this.nullable;
    }

    public void setNullable(Boolean nullable) {
      this.nullable = nullable;
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
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public Boolean getUnique() {
        return this.unique;
    }

    public void setUnique(Boolean unique) {
      this.unique = unique;
    }
    
    public Boolean getUpdate() {
        return this.update;
    }

    public void setUpdate(Boolean update) {
      this.update = update;
    }
    
    public String getValidChars() {
        return this.validChars;
    }

    public void setValidChars(String validChars) {
      this.validChars = validChars;
    }
    
}
