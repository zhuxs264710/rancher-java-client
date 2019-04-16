package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.SourceCodeCredentialSourceCodeTypeEnum;
import io.rancher.model.enums.SourceCodeCredentialTransitioningEnum;

public class SourceCodeCredential extends AbstractType {
    
    private String accessToken;
    
    private Map<String, Object> annotations;
    
    private String avatarUrl;
    
    private String created;
    
    private String creatorId;
    
    private String displayName;
    
    private String gitLoginName;
    
    private String htmlUrl;
    
    private Map<String, Object> labels;
    
    private String loginName;
    
    private Boolean logout;
    /**
     * DnsLabel
     */
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String projectId;
    
    private String removed;
    
    private SourceCodeCredentialSourceCodeTypeEnum sourceCodeType;
    
    private String state;
    
    private SourceCodeCredentialTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String userId;
    
    private String uuid;
    
    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
      this.avatarUrl = avatarUrl;
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
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    
    public String getGitLoginName() {
        return this.gitLoginName;
    }

    public void setGitLoginName(String gitLoginName) {
      this.gitLoginName = gitLoginName;
    }
    
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
      this.htmlUrl = htmlUrl;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
      this.loginName = loginName;
    }
    
    public Boolean getLogout() {
        return this.logout;
    }

    public void setLogout(Boolean logout) {
      this.logout = logout;
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
    
    public SourceCodeCredentialSourceCodeTypeEnum getSourceCodeType() {
        return this.sourceCodeType;
    }

    public void setSourceCodeType(SourceCodeCredentialSourceCodeTypeEnum sourceCodeType) {
      this.sourceCodeType = sourceCodeType;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public SourceCodeCredentialTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(SourceCodeCredentialTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
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
