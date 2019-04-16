package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.NotifierTransitioningEnum;

public class Notifier extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String clusterId;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private PagerdutyConfig pagerdutyConfig;
    
    private String removed;
    
    private SlackConfig slackConfig;
    
    private SmtpConfig smtpConfig;
    
    private String state;
    
    private NotifierStatus status;
    
    private NotifierTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    private WebhookConfig webhookConfig;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
      this.namespaceId = namespaceId;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public PagerdutyConfig getPagerdutyConfig() {
        return this.pagerdutyConfig;
    }

    public void setPagerdutyConfig(PagerdutyConfig pagerdutyConfig) {
      this.pagerdutyConfig = pagerdutyConfig;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
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
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public NotifierStatus getStatus() {
        return this.status;
    }

    public void setStatus(NotifierStatus status) {
      this.status = status;
    }
    
    public NotifierTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(NotifierTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public WebhookConfig getWebhookConfig() {
        return this.webhookConfig;
    }

    public void setWebhookConfig(WebhookConfig webhookConfig) {
      this.webhookConfig = webhookConfig;
    }
    
}
