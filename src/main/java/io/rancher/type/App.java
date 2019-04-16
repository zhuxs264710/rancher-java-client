package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.AppTransitioningEnum;

public class App extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private Map<String, Object> answers;
    
    private String appRevisionId;
    
    private Map<String, Object> appliedFiles;
    
    private List<AppCondition> conditions;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private String externalId;
    
    private Map<String, Object> files;
    
    private Map<String, Object> labels;
    
    private String lastAppliedTemplate;
    
    private String name;
    
    private String namespaceId;
    
    private String notes;
    
    private List<OwnerReference> ownerReferences;
    
    private String projectId;
    
    private Boolean prune;
    
    private String removed;
    
    private String state;
    
    private String targetNamespace;
    
    private AppTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Map<String, Object> getAnswers() {
        return this.answers;
    }

    public void setAnswers(Map<String, Object> answers) {
      this.answers = answers;
    }
    
    public String getAppRevisionId() {
        return this.appRevisionId;
    }

    public void setAppRevisionId(String appRevisionId) {
      this.appRevisionId = appRevisionId;
    }
    
    public Map<String, Object> getAppliedFiles() {
        return this.appliedFiles;
    }

    public void setAppliedFiles(Map<String, Object> appliedFiles) {
      this.appliedFiles = appliedFiles;
    }
    
    public List<AppCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<AppCondition> conditions) {
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public Map<String, Object> getFiles() {
        return this.files;
    }

    public void setFiles(Map<String, Object> files) {
      this.files = files;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLastAppliedTemplate() {
        return this.lastAppliedTemplate;
    }

    public void setLastAppliedTemplate(String lastAppliedTemplate) {
      this.lastAppliedTemplate = lastAppliedTemplate;
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
    
    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
      this.notes = notes;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public Boolean getPrune() {
        return this.prune;
    }

    public void setPrune(Boolean prune) {
      this.prune = prune;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    public void setTargetNamespace(String targetNamespace) {
      this.targetNamespace = targetNamespace;
    }
    
    public AppTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(AppTransitioningEnum transitioning) {
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
    
}
