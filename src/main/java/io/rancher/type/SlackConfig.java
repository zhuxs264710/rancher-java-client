package io.rancher.type;

import io.rancher.base.AbstractType;

public class SlackConfig extends AbstractType {
    
    private String defaultRecipient;
    
    private String url;
    
    public String getDefaultRecipient() {
        return this.defaultRecipient;
    }

    public void setDefaultRecipient(String defaultRecipient) {
      this.defaultRecipient = defaultRecipient;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
}
