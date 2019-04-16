package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class KafkaConfig extends AbstractType {
    
    private List<String> brokerEndpoints;
    
    private String certificate;
    
    private String clientCert;
    
    private String clientKey;
    
    private String topic;
    
    private String zookeeperEndpoint;
    
    public List<String> getBrokerEndpoints() {
        return this.brokerEndpoints;
    }

    public void setBrokerEndpoints(List<String> brokerEndpoints) {
      this.brokerEndpoints = brokerEndpoints;
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
    
    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
      this.topic = topic;
    }
    
    public String getZookeeperEndpoint() {
        return this.zookeeperEndpoint;
    }

    public void setZookeeperEndpoint(String zookeeperEndpoint) {
      this.zookeeperEndpoint = zookeeperEndpoint;
    }
    
}
