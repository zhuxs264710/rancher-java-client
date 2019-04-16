package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.LdapConfigAccessModeEnum;

public class LdapConfig extends AbstractType {
    
    private LdapConfigAccessModeEnum accessMode;
    
    private List<String> allowedPrincipalIds;
    
    private Map<String, Object> annotations;
    
    private String certificate;
    
    private Integer connectionTimeout;
    
    private String created;
    
    private String creatorId;
    
    private Boolean enabled;
    
    private String groupDNAttribute;
    
    private String groupMemberMappingAttribute;
    
    private String groupMemberUserAttribute;
    
    private String groupNameAttribute;
    
    private String groupObjectClass;
    
    private String groupSearchAttribute;
    
    private String groupSearchBase;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private Boolean nestedGroupMembershipEnabled;
    
    private List<OwnerReference> ownerReferences;
    
    private Integer port;
    
    private String removed;
    
    private List<String> servers;
    
    private String serviceAccountDistinguishedName;
    
    private String serviceAccountString;
    
    private Boolean tls;
    
    private String type;
    
    private Integer userDisabledBitMask;
    
    private String userEnabledAttribute;
    
    private String userLoginAttribute;
    
    private String userMemberAttribute;
    
    private String userNameAttribute;
    
    private String userObjectClass;
    
    private String userSearchAttribute;
    
    private String userSearchBase;
    
    private String uuid;
    
    public LdapConfigAccessModeEnum getAccessMode() {
        return this.accessMode;
    }

    public void setAccessMode(LdapConfigAccessModeEnum accessMode) {
      this.accessMode = accessMode;
    }
    
    public List<String> getAllowedPrincipalIds() {
        return this.allowedPrincipalIds;
    }

    public void setAllowedPrincipalIds(List<String> allowedPrincipalIds) {
      this.allowedPrincipalIds = allowedPrincipalIds;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getCertificate() {
        return this.certificate;
    }

    public void setCertificate(String certificate) {
      this.certificate = certificate;
    }
    
    public Integer getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
      this.connectionTimeout = connectionTimeout;
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
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getGroupDNAttribute() {
        return this.groupDNAttribute;
    }

    public void setGroupDNAttribute(String groupDNAttribute) {
      this.groupDNAttribute = groupDNAttribute;
    }
    
    public String getGroupMemberMappingAttribute() {
        return this.groupMemberMappingAttribute;
    }

    public void setGroupMemberMappingAttribute(String groupMemberMappingAttribute) {
      this.groupMemberMappingAttribute = groupMemberMappingAttribute;
    }
    
    public String getGroupMemberUserAttribute() {
        return this.groupMemberUserAttribute;
    }

    public void setGroupMemberUserAttribute(String groupMemberUserAttribute) {
      this.groupMemberUserAttribute = groupMemberUserAttribute;
    }
    
    public String getGroupNameAttribute() {
        return this.groupNameAttribute;
    }

    public void setGroupNameAttribute(String groupNameAttribute) {
      this.groupNameAttribute = groupNameAttribute;
    }
    
    public String getGroupObjectClass() {
        return this.groupObjectClass;
    }

    public void setGroupObjectClass(String groupObjectClass) {
      this.groupObjectClass = groupObjectClass;
    }
    
    public String getGroupSearchAttribute() {
        return this.groupSearchAttribute;
    }

    public void setGroupSearchAttribute(String groupSearchAttribute) {
      this.groupSearchAttribute = groupSearchAttribute;
    }
    
    public String getGroupSearchBase() {
        return this.groupSearchBase;
    }

    public void setGroupSearchBase(String groupSearchBase) {
      this.groupSearchBase = groupSearchBase;
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
    
    public Boolean getNestedGroupMembershipEnabled() {
        return this.nestedGroupMembershipEnabled;
    }

    public void setNestedGroupMembershipEnabled(Boolean nestedGroupMembershipEnabled) {
      this.nestedGroupMembershipEnabled = nestedGroupMembershipEnabled;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public List<String> getServers() {
        return this.servers;
    }

    public void setServers(List<String> servers) {
      this.servers = servers;
    }
    
    public String getServiceAccountDistinguishedName() {
        return this.serviceAccountDistinguishedName;
    }

    public void setServiceAccountDistinguishedName(String serviceAccountDistinguishedName) {
      this.serviceAccountDistinguishedName = serviceAccountDistinguishedName;
    }
    
    public String getServiceAccountString() {
        return this.serviceAccountString;
    }

    public void setServiceAccountString(String serviceAccountString) {
      this.serviceAccountString = serviceAccountString;
    }
    
    public Boolean getTls() {
        return this.tls;
    }

    public void setTls(Boolean tls) {
      this.tls = tls;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public Integer getUserDisabledBitMask() {
        return this.userDisabledBitMask;
    }

    public void setUserDisabledBitMask(Integer userDisabledBitMask) {
      this.userDisabledBitMask = userDisabledBitMask;
    }
    
    public String getUserEnabledAttribute() {
        return this.userEnabledAttribute;
    }

    public void setUserEnabledAttribute(String userEnabledAttribute) {
      this.userEnabledAttribute = userEnabledAttribute;
    }
    
    public String getUserLoginAttribute() {
        return this.userLoginAttribute;
    }

    public void setUserLoginAttribute(String userLoginAttribute) {
      this.userLoginAttribute = userLoginAttribute;
    }
    
    public String getUserMemberAttribute() {
        return this.userMemberAttribute;
    }

    public void setUserMemberAttribute(String userMemberAttribute) {
      this.userMemberAttribute = userMemberAttribute;
    }
    
    public String getUserNameAttribute() {
        return this.userNameAttribute;
    }

    public void setUserNameAttribute(String userNameAttribute) {
      this.userNameAttribute = userNameAttribute;
    }
    
    public String getUserObjectClass() {
        return this.userObjectClass;
    }

    public void setUserObjectClass(String userObjectClass) {
      this.userObjectClass = userObjectClass;
    }
    
    public String getUserSearchAttribute() {
        return this.userSearchAttribute;
    }

    public void setUserSearchAttribute(String userSearchAttribute) {
      this.userSearchAttribute = userSearchAttribute;
    }
    
    public String getUserSearchBase() {
        return this.userSearchBase;
    }

    public void setUserSearchBase(String userSearchBase) {
      this.userSearchBase = userSearchBase;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}
