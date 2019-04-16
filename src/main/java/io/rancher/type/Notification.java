package io.rancher.type;

import io.rancher.base.AbstractType;

public class Notification extends AbstractType {
    
    private String message;
    
    private PagerdutyConfig pagerdutyConfig;
    
    private SlackConfig slackConfig;
    
    private SmtpConfig smtpConfig;
    
    private WebhookConfig webhookConfig;
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
    
    public PagerdutyConfig getPagerdutyConfig() {
        return this.pagerdutyConfig;
    }

    public void setPagerdutyConfig(PagerdutyConfig pagerdutyConfig) {
      this.pagerdutyConfig = pagerdutyConfig;
    }
    
    public SlackConfig getSlackConfig() {
        return this.slackConfig;
    }

    public void setSlackConfig(SlackConfig slackConfig) {
      this.slackConfig = slackConfig;
    }
    
    public SmtpConfig getSmtpConfig() {
        return this.smtpConfig;
    }

    public void setSmtpConfig(SmtpConfig smtpConfig) {
      this.smtpConfig = smtpConfig;
    }
    
    public WebhookConfig getWebhookConfig() {
        return this.webhookConfig;
    }

    public void setWebhookConfig(WebhookConfig webhookConfig) {
      this.webhookConfig = webhookConfig;
    }
    
}
