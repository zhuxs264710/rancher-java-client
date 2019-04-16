package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class Principal extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private Map<String, Object> extraInfo;
    
    private Map<String, Object> labels;
    
    private String loginName;
    
    private Boolean me;
    
    private Boolean memberOf;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String principalType;
    
    private String profilePicture;
    
    private String profileURL;
    
    private String provider;
    
    private String removed;
    
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
    
    public Map<String, Object> getExtraInfo() {
        return this.extraInfo;
    }

    public void setExtraInfo(Map<String, Object> extraInfo) {
      this.extraInfo = extraInfo;
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
    
    public Boolean getMe() {
        return this.me;
    }

    public void setMe(Boolean me) {
      this.me = me;
    }
    
    public Boolean getMemberOf() {
        return this.memberOf;
    }

    public void setMemberOf(Boolean memberOf) {
      this.memberOf = memberOf;
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
    
    public String getPrincipalType() {
        return this.principalType;
    }

    public void setPrincipalType(String principalType) {
      this.principalType = principalType;
    }
    
    public String getProfilePicture() {
        return this.profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
      this.profilePicture = profilePicture;
    }
    
    public String getProfileURL() {
        return this.profileURL;
    }

    public void setProfileURL(String profileURL) {
      this.profileURL = profileURL;
    }
    
    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
      this.provider = provider;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
