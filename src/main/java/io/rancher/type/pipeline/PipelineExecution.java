package io.rancher.type.pipeline;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.PipelineExecutionTransitioningEnum;
import io.rancher.model.enums.PipelineExecutionTriggeredByEnum;
import io.rancher.type.OwnerReference;
import io.rancher.type.StageStatus;

public class PipelineExecution extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String author;
    
    private String avatarUrl;
    
    private String branch;
    
    private String commit;
    
    private List<PipelineCondition> conditions;
    
    private String created;
    
    private String creatorId;
    
    private String email;
    
    private String ended;
    
    private String event;
    
    private String executionState;
    
    private String htmlLink;
    
    private Map<String, Object> labels;
    
    private String message;
    /**
     * DnsLabel
     */
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private PipelineConfig pipelineConfig;
    
    private String pipelineId;
    
    private String projectId;
    
    private String ref;
    
    private String removed;
    
    private String repositoryUrl;
    
    private Integer run;
    
    private List<StageStatus> stages;
    
    private String started;
    
    private String state;
    
    private String title;
    
    private PipelineExecutionTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String triggerUserId;
    
    private PipelineExecutionTriggeredByEnum triggeredBy;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
      this.author = author;
    }
    
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
      this.avatarUrl = avatarUrl;
    }
    
    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
      this.branch = branch;
    }
    
    public String getCommit() {
        return this.commit;
    }

    public void setCommit(String commit) {
      this.commit = commit;
    }
    
    public List<PipelineCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<PipelineCondition> conditions) {
      this.conditions = conditions;
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
    
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
      this.email = email;
    }
    
    public String getEnded() {
        return this.ended;
    }

    public void setEnded(String ended) {
      this.ended = ended;
    }
    
    public String getEvent() {
        return this.event;
    }

    public void setEvent(String event) {
      this.event = event;
    }
    
    public String getExecutionState() {
        return this.executionState;
    }

    public void setExecutionState(String executionState) {
      this.executionState = executionState;
    }
    
    public String getHtmlLink() {
        return this.htmlLink;
    }

    public void setHtmlLink(String htmlLink) {
      this.htmlLink = htmlLink;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
      this.message = message;
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
    
    public PipelineConfig getPipelineConfig() {
        return this.pipelineConfig;
    }

    public void setPipelineConfig(PipelineConfig pipelineConfig) {
      this.pipelineConfig = pipelineConfig;
    }
    
    public String getPipelineId() {
        return this.pipelineId;
    }

    public void setPipelineId(String pipelineId) {
      this.pipelineId = pipelineId;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRef() {
        return this.ref;
    }

    public void setRef(String ref) {
      this.ref = ref;
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
    
    public Integer getRun() {
        return this.run;
    }

    public void setRun(Integer run) {
      this.run = run;
    }
    
    public List<StageStatus> getStages() {
        return this.stages;
    }

    public void setStages(List<StageStatus> stages) {
      this.stages = stages;
    }
    
    public String getStarted() {
        return this.started;
    }

    public void setStarted(String started) {
      this.started = started;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
      this.title = title;
    }
    
    public PipelineExecutionTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(PipelineExecutionTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getTriggerUserId() {
        return this.triggerUserId;
    }

    public void setTriggerUserId(String triggerUserId) {
      this.triggerUserId = triggerUserId;
    }
    
    public PipelineExecutionTriggeredByEnum getTriggeredBy() {
        return this.triggeredBy;
    }

    public void setTriggeredBy(PipelineExecutionTriggeredByEnum triggeredBy) {
      this.triggeredBy = triggeredBy;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
