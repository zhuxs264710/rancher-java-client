package io.rancher.type.cloudprovider.aws;

import io.rancher.base.AbstractType;
import java.util.List;

public class AmazonElasticContainerServiceConfig extends AbstractType {
    
    private String accessKey;
    
    private String ami;
    
    private Boolean associateWorkerNodePublicIp;
    
    private String instanceType;
    
    private Integer maximumNodes;
    
    private Integer minimumNodes;
    
    private String region;
    
    private String secretKey;
    
    private List<String> securityGroups;
    
    private String serviceRole;
    
    private String sessionToken;
    
    private List<String> subnets;
    
    private String virtualNetwork;
    
    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
      this.accessKey = accessKey;
    }
    
    public String getAmi() {
        return this.ami;
    }

    public void setAmi(String ami) {
      this.ami = ami;
    }
    
    public Boolean getAssociateWorkerNodePublicIp() {
        return this.associateWorkerNodePublicIp;
    }

    public void setAssociateWorkerNodePublicIp(Boolean associateWorkerNodePublicIp) {
      this.associateWorkerNodePublicIp = associateWorkerNodePublicIp;
    }
    
    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
      this.instanceType = instanceType;
    }
    
    public Integer getMaximumNodes() {
        return this.maximumNodes;
    }

    public void setMaximumNodes(Integer maximumNodes) {
      this.maximumNodes = maximumNodes;
    }
    
    public Integer getMinimumNodes() {
        return this.minimumNodes;
    }

    public void setMinimumNodes(Integer minimumNodes) {
      this.minimumNodes = minimumNodes;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(String secretKey) {
      this.secretKey = secretKey;
    }
    
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
      this.securityGroups = securityGroups;
    }
    
    public String getServiceRole() {
        return this.serviceRole;
    }

    public void setServiceRole(String serviceRole) {
      this.serviceRole = serviceRole;
    }
    
    public String getSessionToken() {
        return this.sessionToken;
    }

    public void setSessionToken(String sessionToken) {
      this.sessionToken = sessionToken;
    }
    
    public List<String> getSubnets() {
        return this.subnets;
    }

    public void setSubnets(List<String> subnets) {
      this.subnets = subnets;
    }
    
    public String getVirtualNetwork() {
        return this.virtualNetwork;
    }

    public void setVirtualNetwork(String virtualNetwork) {
      this.virtualNetwork = virtualNetwork;
    }
    
}
