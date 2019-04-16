package io.rancher.type.pipeline;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.PipelinePipelineStateEnum;
import io.rancher.model.enums.PipelineTransitioningEnum;
import io.rancher.type.OwnerReference;
import io.rancher.type.SourceCodeCredential;

public class Pipeline extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private Map<String, Object> labels;
    
    private String lastExecutionId;
    
    private String lastRunState;
    
    private String lastStarted;
    
    private String name;
    
    private String namespaceId;
    
    private Integer nextRun;
    
    private String nextStart;
    
    private List<OwnerReference> ownerReferences;
    
    private PipelinePipelineStateEnum pipelineState;
    
    private String projectId;
    
    private String removed;
    
    private String repositoryUrl;
    
    private SourceCodeCredential sourceCodeCredential;
    
    private String sourceCodeCredentialId;
    
    private String state;
    
    private String token;
    
    private PipelineTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private Boolean triggerWebhookPr;
    
    private Boolean triggerWebhookPush;
    
    private Boolean triggerWebhookTag;
    
    private String uuid;
    
    private String webhookId;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
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
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLastExecutionId() {
        return this.lastExecutionId;
    }

    public void setLastExecutionId(String lastExecutionId) {
      this.lastExecutionId = lastExecutionId;
    }
    
    public String getLastRunState() {
        return this.lastRunState;
    }

    public void setLastRunState(String lastRunState) {
      this.lastRunState = lastRunState;
    }
    
    public String getLastStarted() {
        return this.lastStarted;
    }

    public void setLastStarted(String lastStarted) {
      this.lastStarted = lastStarted;
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
    
    public Integer getNextRun() {
        return this.nextRun;
    }

    public void setNextRun(Integer nextRun) {
      this.nextRun = nextRun;
    }
    
    public String getNextStart() {
        return this.nextStart;
    }

    public void setNextStart(String nextStart) {
      this.nextStart = nextStart;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public PipelinePipelineStateEnum getPipelineState() {
        return this.pipelineState;
    }

    public void setPipelineState(PipelinePipelineStateEnum pipelineState) {
      this.pipelineState = pipelineState;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
      this.repositoryUrl = repositoryUrl;
    }
    
    public SourceCodeCredential getSourceCodeCredential() {
        return this.sourceCodeCredential;
    }

    public void setSourceCodeCredential(SourceCodeCredential sourceCodeCredential) {
      this.sourceCodeCredential = sourceCodeCredential;
    }
    
    public String getSourceCodeCredentialId() {
        return this.sourceCodeCredentialId;
    }

    public void setSourceCodeCredentialId(String sourceCodeCredentialId) {
      this.sourceCodeCredentialId = sourceCodeCredentialId;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
      this.token = token;
    }
    
    public PipelineTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(PipelineTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Boolean getTriggerWebhookPr() {
        return this.triggerWebhookPr;
    }

    public void setTriggerWebhookPr(Boolean triggerWebhookPr) {
      this.triggerWebhookPr = triggerWebhookPr;
    }
    
    public Boolean getTriggerWebhookPush() {
        return this.triggerWebhookPush;
    }

    public void setTriggerWebhookPush(Boolean triggerWebhookPush) {
      this.triggerWebhookPush = triggerWebhookPush;
    }
    
    public Boolean getTriggerWebhookTag() {
        return this.triggerWebhookTag;
    }

    public void setTriggerWebhookTag(Boolean triggerWebhookTag) {
      this.triggerWebhookTag = triggerWebhookTag;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getWebhookId() {
        return this.webhookId;
    }

    public void setWebhookId(String webhookId) {
      this.webhookId = webhookId;
    }
    
}
