package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class TemplateVersionSpec extends AbstractType {
    
    private String appReadme;
    
    private String digest;
    
    private String externalId;
    
    private Map<String, Object> files;
    
    private String kubeVersion;
    
    private List<Question> questions;
    
    private String rancherVersion;
    
    private String readme;
    
    private String requiredNamespace;
    
    private Map<String, Object> upgradeVersionLinks;
    
    private String version;
    
    public String getAppReadme() {
        return this.appReadme;
    }

    public void setAppReadme(String appReadme) {
      this.appReadme = appReadme;
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
    
    public String getRequiredNamespace() {
        return this.requiredNamespace;
    }

    public void setRequiredNamespace(String requiredNamespace) {
      this.requiredNamespace = requiredNamespace;
    }
    
    public Map<String, Object> getUpgradeVersionLinks() {
        return this.upgradeVersionLinks;
    }

    public void setUpgradeVersionLinks(Map<String, Object> upgradeVersionLinks) {
      this.upgradeVersionLinks = upgradeVersionLinks;
    }
    
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
    
}
