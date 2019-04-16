package io.rancher.type.kubernetes.cluster.namespaces;

import io.rancher.base.AbstractType;
import io.rancher.type.OwnerReference;

import java.util.List;
import java.util.Map;

public class NamespacedCertificate extends AbstractType {
    
    private String algorithm;
    
    private Map<String, Object> annotations;
    
    private String certFingerprint;
    
    private String certs;
    
    private String cn;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private String expiresAt;
    
    private String issuedAt;
    
    private String issuer;
    
    private String key;
    
    private String keySize;
    
    private Map<String, Object> labels;
    /**
     * DnsLabel
     */
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private String projectId;
    
    private String removed;
    
    private String serialNumber;
    
    private List<String> subjectAlternativeNames;
    
    private String uuid;
    
    private String version;
    
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
    
    public String getCertFingerprint() {
        return this.certFingerprint;
    }

    public void setCertFingerprint(String certFingerprint) {
      this.certFingerprint = certFingerprint;
    }
    
    public String getCerts() {
        return this.certs;
    }

    public void setCerts(String certs) {
      this.certs = certs;
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
    
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
      this.expiresAt = expiresAt;
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
    
    public String getKeySize() {
        return this.keySize;
    }

    public void setKeySize(String keySize) {
      this.keySize = keySize;
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
