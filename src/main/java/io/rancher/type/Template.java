package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.TemplateTransitioningEnum;

public class Template extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String catalogId;
    
    private List<String> categories;
    
    private String category;
    
    private String created;
    
    private String creatorId;
    
    private String defaultTemplateVersionId;
    
    private String defaultVersion;
    
    private String description;
    
    private String folderName;
    
    private String icon;
    
    private String iconFilename;
    
    private Map<String, Object> labels;
    
    private String maintainer;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String path;
    
    private String projectURL;
    
    private String readme;
    
    private String removed;
    
    private String state;
    
    private TemplateStatus status;
    
    private TemplateTransitioningEnum transitioning;
    
    private String transitioningMessage;
    
    private String upgradeFrom;
    
    private String uuid;
    
    private Map<String, Object> versionLinks;
    
    private List<TemplateVersionSpec> versions;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getCatalogId() {
        return this.catalogId;
    }

    public void setCatalogId(String catalogId) {
      this.catalogId = catalogId;
    }
    
    public List<String> getCategories() {
        return this.categories;
    }

    public void setCategories(List<String> categories) {
      this.categories = categories;
    }
    
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
      this.category = category;
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
    
    public String getDefaultTemplateVersionId() {
        return this.defaultTemplateVersionId;
    }

    public void setDefaultTemplateVersionId(String defaultTemplateVersionId) {
      this.defaultTemplateVersionId = defaultTemplateVersionId;
    }
    
    public String getDefaultVersion() {
        return this.defaultVersion;
    }

    public void setDefaultVersion(String defaultVersion) {
      this.defaultVersion = defaultVersion;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public String getFolderName() {
        return this.folderName;
    }

    public void setFolderName(String folderName) {
      this.folderName = folderName;
    }
    
    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
      this.icon = icon;
    }
    
    public String getIconFilename() {
        return this.iconFilename;
    }

    public void setIconFilename(String iconFilename) {
      this.iconFilename = iconFilename;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getMaintainer() {
        return this.maintainer;
    }

    public void setMaintainer(String maintainer) {
      this.maintainer = maintainer;
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
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public String getProjectURL() {
        return this.projectURL;
    }

    public void setProjectURL(String projectURL) {
      this.projectURL = projectURL;
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
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public TemplateStatus getStatus() {
        return this.status;
    }

    public void setStatus(TemplateStatus status) {
      this.status = status;
    }
    
    public TemplateTransitioningEnum getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(TemplateTransitioningEnum transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUpgradeFrom() {
        return this.upgradeFrom;
    }

    public void setUpgradeFrom(String upgradeFrom) {
      this.upgradeFrom = upgradeFrom;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Map<String, Object> getVersionLinks() {
        return this.versionLinks;
    }

    public void setVersionLinks(Map<String, Object> versionLinks) {
      this.versionLinks = versionLinks;
    }
    
    public List<TemplateVersionSpec> getVersions() {
        return this.versions;
    }

    public void setVersions(List<TemplateVersionSpec> versions) {
      this.versions = versions;
    }
    
}
