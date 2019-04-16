package io.rancher.type.cloudprovider.azure;

import io.rancher.base.AbstractType;
import java.util.Map;

public class AzureKubernetesServiceConfig extends AbstractType {
    
    private String adminUsername;
    
    private String agentDnsPrefix;
    
    private String agentPoolName;
    
    private String agentVmSize;
    
    private String baseUrl;
    
    private String clientId;
    
    private String clientSecret;
    
    private Integer count;
    
    private String dnsServiceIp;
    
    private String dockerBridgeCidr;
    
    private String kubernetesVersion;
    
    private String location;
    
    private String masterDnsPrefix;
    
    private Integer osDiskSizeGb;
    
    private String resourceGroup;
    
    private String serviceCidr;
    
    private String sshPublicKeyContents;
    
    private String subnet;
    
    private String subscriptionId;
    
    private Map<String, Object> tags;
    
    private String tenantId;
    
    private String virtualNetwork;
    
    private String virtualNetworkResourceGroup;
    
    public String getAdminUsername() {
        return this.adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
      this.adminUsername = adminUsername;
    }
    
    public String getAgentDnsPrefix() {
        return this.agentDnsPrefix;
    }

    public void setAgentDnsPrefix(String agentDnsPrefix) {
      this.agentDnsPrefix = agentDnsPrefix;
    }
    
    public String getAgentPoolName() {
        return this.agentPoolName;
    }

    public void setAgentPoolName(String agentPoolName) {
      this.agentPoolName = agentPoolName;
    }
    
    public String getAgentVmSize() {
        return this.agentVmSize;
    }

    public void setAgentVmSize(String agentVmSize) {
      this.agentVmSize = agentVmSize;
    }
    
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
      this.baseUrl = baseUrl;
    }
    
    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String clientId) {
      this.clientId = clientId;
    }
    
    public String getClientSecret() {
        return this.clientSecret;
    }

    public void setClientSecret(String clientSecret) {
      this.clientSecret = clientSecret;
    }
    
    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
      this.count = count;
    }
    
    public String getDnsServiceIp() {
        return this.dnsServiceIp;
    }

    public void setDnsServiceIp(String dnsServiceIp) {
      this.dnsServiceIp = dnsServiceIp;
    }
    
    public String getDockerBridgeCidr() {
        return this.dockerBridgeCidr;
    }

    public void setDockerBridgeCidr(String dockerBridgeCidr) {
      this.dockerBridgeCidr = dockerBridgeCidr;
    }
    
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
      this.kubernetesVersion = kubernetesVersion;
    }
    
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
      this.location = location;
    }
    
    public String getMasterDnsPrefix() {
        return this.masterDnsPrefix;
    }

    public void setMasterDnsPrefix(String masterDnsPrefix) {
      this.masterDnsPrefix = masterDnsPrefix;
    }
    
    public Integer getOsDiskSizeGb() {
        return this.osDiskSizeGb;
    }

    public void setOsDiskSizeGb(Integer osDiskSizeGb) {
      this.osDiskSizeGb = osDiskSizeGb;
    }
    
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
    }
    
    public String getServiceCidr() {
        return this.serviceCidr;
    }

    public void setServiceCidr(String serviceCidr) {
      this.serviceCidr = serviceCidr;
    }
    
    public String getSshPublicKeyContents() {
        return this.sshPublicKeyContents;
    }

    public void setSshPublicKeyContents(String sshPublicKeyContents) {
      this.sshPublicKeyContents = sshPublicKeyContents;
    }
    
    public String getSubnet() {
        return this.subnet;
    }

    public void setSubnet(String subnet) {
      this.subnet = subnet;
    }
    
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
    }
    
    public Map<String, Object> getTags() {
        return this.tags;
    }

    public void setTags(Map<String, Object> tags) {
      this.tags = tags;
    }
    
    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
    }
    
    public String getVirtualNetwork() {
        return this.virtualNetwork;
    }

    public void setVirtualNetwork(String virtualNetwork) {
      this.virtualNetwork = virtualNetwork;
    }
    
    public String getVirtualNetworkResourceGroup() {
        return this.virtualNetworkResourceGroup;
    }

    public void setVirtualNetworkResourceGroup(String virtualNetworkResourceGroup) {
      this.virtualNetworkResourceGroup = virtualNetworkResourceGroup;
    }
    
}
