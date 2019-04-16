package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.ElasticsearchConfigSslVersionEnum;

public class ElasticsearchConfig extends AbstractType {
    
    private String authPassword;
    
    private String authUsername;
    
    private String certificate;
    
    private String clientCert;
    
    private String clientKey;
    
    private String clientKeyPass;
    
    private String dateFormat;
    
    private String endpoint;
    
    private String indexPrefix;
    
    private Boolean sslVerify;
    
    private ElasticsearchConfigSslVersionEnum sslVersion;
    
    public String getAuthPassword() {
        return this.authPassword;
    }

    public void setAuthPassword(String authPassword) {
      this.authPassword = authPassword;
    }
    
    public String getAuthUsername() {
        return this.authUsername;
    }

    public void setAuthUsername(String authUsername) {
      this.authUsername = authUsername;
    }
    
    public String getCertificate() {
        return this.certificate;
    }

    public void setCertificate(String certificate) {
      this.certificate = certificate;
    }
    
    public String getClientCert() {
        return this.clientCert;
    }

    public void setClientCert(String clientCert) {
      this.clientCert = clientCert;
    }
    
    public String getClientKey() {
        return this.clientKey;
    }

    public void setClientKey(String clientKey) {
      this.clientKey = clientKey;
    }
    
    public String getClientKeyPass() {
        return this.clientKeyPass;
    }

    public void setClientKeyPass(String clientKeyPass) {
      this.clientKeyPass = clientKeyPass;
    }
    
    public String getDateFormat() {
        return this.dateFormat;
    }

    public void setDateFormat(String dateFormat) {
      this.dateFormat = dateFormat;
    }
    
    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
      this.endpoint = endpoint;
    }
    
    public String getIndexPrefix() {
        return this.indexPrefix;
    }

    public void setIndexPrefix(String indexPrefix) {
      this.indexPrefix = indexPrefix;
    }
    
    public Boolean getSslVerify() {
        return this.sslVerify;
    }

    public void setSslVerify(Boolean sslVerify) {
      this.sslVerify = sslVerify;
    }
    
    public ElasticsearchConfigSslVersionEnum getSslVersion() {
        return this.sslVersion;
    }

    public void setSslVersion(ElasticsearchConfigSslVersionEnum sslVersion) {
      this.sslVersion = sslVersion;
    }
    
}
