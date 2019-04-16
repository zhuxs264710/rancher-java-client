package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.TemplateVersionTransitioningEnum;

public class TemplateVersion extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String appReadme;
    
    private String created;
    
    private String creatorId;
    
    private String digest;
    
    private String externalId;
    
    private Map<String, Object> files;
    
    private String kubeVersion;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private List<Question> questions;
    
    private String rancherVersion;
    
    private String readme;
    
    private String removed;
    
    private String requiredNamespace;
    
    private String state;
    
    private TemplateVersionStatus status;
    
    private TemplateVersionTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private Map<String, Object> upgradeVersionLinks;
    
    private String uuid;
    
    private String version;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getAppReadme() {
        return this.appReadme;
    }

    public void setAppReadme(String appReadme) {
      this.appReadme = appReadme;
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
    
    public String getDigest() {
        return this.digest;
    }

    public void setDigest(String digest) {
      this.digest = digest;
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
    
    public String getKubeVersion() {
        return this.kubeVersion;
    }

    public void setKubeVersion(String kubeVersion) {
      this.kubeVersion = kubeVersion;
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
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public List<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<Question> questions) {
      this.questions = questions;
    }
    
    public String getRancherVersion() {
        return this.rancherVersion;
    }

    public void setRancherVersion(String rancherVersion) {
      this.rancherVersion = rancherVersion;
    }
    
    public String getReadme() {
        return this.readme;
    }

    public void setReadme(String readme) {
      this.readme = readme;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getRequiredNamespace() {
        return this.requiredNamespace;
    }

    public void setRequiredNamespace(String requiredNamespace) {
      this.requiredNamespace = requiredNamespace;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public TemplateVersionStatus getStatus() {
        return this.status;
    }

    public void setStatus(TemplateVersionStatus status) {
      this.status = status;
    }
    
    public TemplateVersionTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(TemplateVersionTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Map<String, Object> getUpgradeVersionLinks() {
        return this.upgradeVersionLinks;
    }

    public void setUpgradeVersionLinks(Map<String, Object> upgradeVersionLinks) {
      this.upgradeVersionLinks = upgradeVersionLinks;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
    
}
