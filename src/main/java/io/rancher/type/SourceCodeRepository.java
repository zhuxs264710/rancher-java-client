package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.SourceCodeRepositorySourceCodeTypeEnum;
import io.rancher.model.enums.SourceCodeRepositoryTransitioningEnum;

public class SourceCodeRepository extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private String defaultBranch;
    
    private Map<String, Object> labels;
    
    private String language;
    /**
     * String
     */
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private RepoPerm permissions;
    
    private String projectId;
    
    private String removed;
    
    private String sourceCodeCredentialId;
    
    private SourceCodeRepositorySourceCodeTypeEnum sourceCodeType;
    
    private String state;
    
    private SourceCodeRepositoryStatus status;
    
    private SourceCodeRepositoryTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String url;
    
    private String userId;
    
    private String uuid;
    
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
    
    public String getDefaultBranch() {
        return this.defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
      this.defaultBranch = defaultBranch;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
      this.language = language;
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
    
    public RepoPerm getPermissions() {
        return this.permissions;
    }

    public void setPermissions(RepoPerm permissions) {
      this.permissions = permissions;
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
    
    public String getSourceCodeCredentialId() {
        return this.sourceCodeCredentialId;
    }

    public void setSourceCodeCredentialId(String sourceCodeCredentialId) {
      this.sourceCodeCredentialId = sourceCodeCredentialId;
    }
    
    public SourceCodeRepositorySourceCodeTypeEnum getSourceCodeType() {
        return this.sourceCodeType;
    }

    public void setSourceCodeType(SourceCodeRepositorySourceCodeTypeEnum sourceCodeType) {
      this.sourceCodeType = sourceCodeType;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public SourceCodeRepositoryStatus getStatus() {
        return this.status;
    }

    public void setStatus(SourceCodeRepositoryStatus status) {
      this.status = status;
    }
    
    public SourceCodeRepositoryTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(SourceCodeRepositoryTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
      this.userId = userId;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
