package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.ListenConfigModeEnum;

public class ListenConfig extends AbstractType {
    
    private String algorithm;
    
    private Map<String, Object> annotations;
    
    private String caCerts;
    
    private String cert;
    
    private String certFingerprint;
    
    private String cn;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private List<String> domains;
    
    private Boolean enabled;
    
    private String expiresAt;
    
    private Map<String, Object> generatedCerts;
    
    private String issuedAt;
    
    private String issuer;
    
    private String key;
    
    private Integer keySize;
    
    private List<String> knownIps;
    
    private Map<String, Object> labels;
    
    private ListenConfigModeEnum mode;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private String serialNumber;
    
    private List<String> subjectAlternativeNames;
    
    private List<String> tos;
    
    private String uuid;
    
    private Integer version;
    
    public String getAlgorithm() {
        return this.algorithm;
    }

    public void setAlgorithm(String algorithm) {
      this.algorithm = algorithm;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getCaCerts() {
        return this.caCerts;
    }

    public void setCaCerts(String caCerts) {
      this.caCerts = caCerts;
    }
    
    public String getCert() {
        return this.cert;
    }

    public void setCert(String cert) {
      this.cert = cert;
    }
    
    public String getCertFingerprint() {
        return this.certFingerprint;
    }

    public void setCertFingerprint(String certFingerprint) {
      this.certFingerprint = certFingerprint;
    }
    
    public String getCn() {
        return this.cn;
    }

    public void setCn(String cn) {
      this.cn = cn;
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
    
    public List<String> getDomains() {
        return this.domains;
    }

    public void setDomains(List<String> domains) {
      this.domains = domains;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
      this.expiresAt = expiresAt;
    }
    
    public Map<String, Object> getGeneratedCerts() {
        return this.generatedCerts;
    }

    public void setGeneratedCerts(Map<String, Object> generatedCerts) {
      this.generatedCerts = generatedCerts;
    }
    
    public String getIssuedAt() {
        return this.issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
      this.issuedAt = issuedAt;
    }
    
    public String getIssuer() {
        return this.issuer;
    }

    public void setIssuer(String issuer) {
      this.issuer = issuer;
    }
    
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
      this.key = key;
    }
    
    public Integer getKeySize() {
        return this.keySize;
    }

    public void setKeySize(Integer keySize) {
      this.keySize = keySize;
    }
    
    public List<String> getKnownIps() {
        return this.knownIps;
    }

    public void setKnownIps(List<String> knownIps) {
      this.knownIps = knownIps;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public ListenConfigModeEnum getMode() {
        return this.mode;
    }

    public void setMode(ListenConfigModeEnum mode) {
      this.mode = mode;
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
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
      this.serialNumber = serialNumber;
    }
    
    public List<String> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    public void setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
      this.subjectAlternativeNames = subjectAlternativeNames;
    }
    
    public List<String> getTos() {
        return this.tos;
    }

    public void setTos(List<String> tos) {
      this.tos = tos;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
      this.version = version;
    }
    
}
