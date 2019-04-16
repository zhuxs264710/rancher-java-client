package io.rancher.type.project;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.ProjectAlertSeverityEnum;
import io.rancher.model.enums.ProjectAlertTransitioningEnum;
import io.rancher.type.OwnerReference;
import io.rancher.type.Recipient;
import io.rancher.type.TargetPod;
import io.rancher.type.TargetWorkload;

public class ProjectAlert extends AbstractType {
    
    private String alertState;
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private Integer initialWaitSeconds;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private String projectId;
    
    private List<Recipient> recipients;
    
    private String removed;
    
    private Integer repeatIntervalSeconds;
    
    private ProjectAlertSeverityEnum severity;
    
    private String state;
    
    private TargetPod targetPod;
    
    private TargetWorkload targetWorkload;
    
    private ProjectAlertTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    public String getAlertState() {
        return this.alertState;
    }

    public void setAlertState(String alertState) {
      this.alertState = alertState;
    }
    
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Integer getInitialWaitSeconds() {
        return this.initialWaitSeconds;
    }

    public void setInitialWaitSeconds(Integer initialWaitSeconds) {
      this.initialWaitSeconds = initialWaitSeconds;
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
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public List<Recipient> getRecipients() {
        return this.recipients;
    }

    public void setRecipients(List<Recipient> recipients) {
      this.recipients = recipients;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public Integer getRepeatIntervalSeconds() {
        return this.repeatIntervalSeconds;
    }

    public void setRepeatIntervalSeconds(Integer repeatIntervalSeconds) {
      this.repeatIntervalSeconds = repeatIntervalSeconds;
    }
    
    public ProjectAlertSeverityEnum getSeverity() {
        return this.severity;
    }

    public void setSeverity(ProjectAlertSeverityEnum severity) {
      this.severity = severity;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public TargetPod getTargetPod() {
        return this.targetPod;
    }

    public void setTargetPod(TargetPod targetPod) {
      this.targetPod = targetPod;
    }
    
    public TargetWorkload getTargetWorkload() {
        return this.targetWorkload;
    }

    public void setTargetWorkload(TargetWorkload targetWorkload) {
      this.targetWorkload = targetWorkload;
    }
    
    public ProjectAlertTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(ProjectAlertTransitioningEnum transitioning) {
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
