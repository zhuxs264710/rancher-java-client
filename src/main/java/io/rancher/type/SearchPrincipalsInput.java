package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.SearchPrincipalsInputPrincipalTypeEnum;

public class SearchPrincipalsInput extends AbstractType {
    
    private String name;
    
    private SearchPrincipalsInputPrincipalTypeEnum principalType;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public SearchPrincipalsInputPrincipalTypeEnum getPrincipalType() {
        return this.principalType;
    }

    public void setPrincipalType(SearchPrincipalsInputPrincipalTypeEnum principalType) {
      this.principalType = principalType;
    }
    
}
