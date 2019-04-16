package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class AzureFileVolumeSource extends AbstractType {
    
    private Boolean readOnly;
    
    private String secretName;
    
    private String shareName;
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public String getSecretName() {
        return this.secretName;
    }

    public void setSecretName(String secretName) {
      this.secretName = secretName;
    }
    
    public String getShareName() {
        return this.shareName;
    }

    public void setShareName(String shareName) {
      this.shareName = shareName;
    }
    
}
