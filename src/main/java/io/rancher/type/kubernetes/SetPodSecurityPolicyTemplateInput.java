package io.rancher.type.kubernetes;

import io.rancher.base.AbstractType;

public class SetPodSecurityPolicyTemplateInput extends AbstractType {
    
    private String podSecurityPolicyTemplateId;
    
    public String getPodSecurityPolicyTemplateId() {
        return this.podSecurityPolicyTemplateId;
    }

    public void setPodSecurityPolicyTemplateId(String podSecurityPolicyTemplateId) {
      this.podSecurityPolicyTemplateId = podSecurityPolicyTemplateId;
    }
    
}
