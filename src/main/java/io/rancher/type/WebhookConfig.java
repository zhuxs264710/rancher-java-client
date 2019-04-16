package io.rancher.type;

import io.rancher.base.AbstractType;

public class WebhookConfig extends AbstractType {
    
    private String url;
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
}
