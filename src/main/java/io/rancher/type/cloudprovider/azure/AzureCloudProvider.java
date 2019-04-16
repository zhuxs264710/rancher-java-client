package io.rancher.type.cloudprovider.azure;

import io.rancher.base.AbstractType;

public class AzureCloudProvider extends AbstractType {
    
    private String aadClientCertPassword;
    
    private String aadClientCertPath;
    
    private String aadClientId;
    
    private String aadClientSecret;
    
    private String cloud;
    
    private Boolean cloudProviderBackoff;
    
    private Integer cloudProviderBackoffDuration;
    
    private Integer cloudProviderBackoffExponent;
    
    private Integer cloudProviderBackoffJitter;
    
    private Integer cloudProviderBackoffRetries;
    
    private Boolean cloudProviderRateLimit;
    
    private Integer cloudProviderRateLimitBucket;
    
    private Integer cloudProviderRateLimitQPS;
    
    private String location;
    
    private Integer maximumLoadBalancerRuleCount;
    
    private String primaryAvailabilitySetName;
    
    private String primaryScaleSetName;
    
    private String resourceGroup;
    
    private String routeTableName;
    
    private String securityGroupName;
    
    private String subnetName;
    
    private String subscriptionId;
    
    private String tenantId;
    
    private Boolean useInstanceMetadata;
    
    private Boolean useManagedIdentityExtension;
    
    private String vmType;
    
    private String vnetName;
    
    private String vnetResourceGroup;
    
    public String getAadClientCertPassword() {
        return this.aadClientCertPassword;
    }

    public void setAadClientCertPassword(String aadClientCertPassword) {
      this.aadClientCertPassword = aadClientCertPassword;
    }
    
    public String getAadClientCertPath() {
        return this.aadClientCertPath;
    }

    public void setAadClientCertPath(String aadClientCertPath) {
      this.aadClientCertPath = aadClientCertPath;
    }
    
    public String getAadClientId() {
        return this.aadClientId;
    }

    public void setAadClientId(String aadClientId) {
      this.aadClientId = aadClientId;
    }
    
    public String getAadClientSecret() {
        return this.aadClientSecret;
    }

    public void setAadClientSecret(String aadClientSecret) {
      this.aadClientSecret = aadClientSecret;
    }
    
    public String getCloud() {
        return this.cloud;
    }

    public void setCloud(String cloud) {
      this.cloud = cloud;
    }
    
    public Boolean getCloudProviderBackoff() {
        return this.cloudProviderBackoff;
    }

    public void setCloudProviderBackoff(Boolean cloudProviderBackoff) {
      this.cloudProviderBackoff = cloudProviderBackoff;
    }
    
    public Integer getCloudProviderBackoffDuration() {
        return this.cloudProviderBackoffDuration;
    }

    public void setCloudProviderBackoffDuration(Integer cloudProviderBackoffDuration) {
      this.cloudProviderBackoffDuration = cloudProviderBackoffDuration;
    }
    
    public Integer getCloudProviderBackoffExponent() {
        return this.cloudProviderBackoffExponent;
    }

    public void setCloudProviderBackoffExponent(Integer cloudProviderBackoffExponent) {
      this.cloudProviderBackoffExponent = cloudProviderBackoffExponent;
    }
    
    public Integer getCloudProviderBackoffJitter() {
        return this.cloudProviderBackoffJitter;
    }

    public void setCloudProviderBackoffJitter(Integer cloudProviderBackoffJitter) {
      this.cloudProviderBackoffJitter = cloudProviderBackoffJitter;
    }
    
    public Integer getCloudProviderBackoffRetries() {
        return this.cloudProviderBackoffRetries;
    }

    public void setCloudProviderBackoffRetries(Integer cloudProviderBackoffRetries) {
      this.cloudProviderBackoffRetries = cloudProviderBackoffRetries;
    }
    
    public Boolean getCloudProviderRateLimit() {
        return this.cloudProviderRateLimit;
    }

    public void setCloudProviderRateLimit(Boolean cloudProviderRateLimit) {
      this.cloudProviderRateLimit = cloudProviderRateLimit;
    }
    
    public Integer getCloudProviderRateLimitBucket() {
        return this.cloudProviderRateLimitBucket;
    }

    public void setCloudProviderRateLimitBucket(Integer cloudProviderRateLimitBucket) {
      this.cloudProviderRateLimitBucket = cloudProviderRateLimitBucket;
    }
    
    public Integer getCloudProviderRateLimitQPS() {
        return this.cloudProviderRateLimitQPS;
    }

    public void setCloudProviderRateLimitQPS(Integer cloudProviderRateLimitQPS) {
      this.cloudProviderRateLimitQPS = cloudProviderRateLimitQPS;
    }
    
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
      this.location = location;
    }
    
    public Integer getMaximumLoadBalancerRuleCount() {
        return this.maximumLoadBalancerRuleCount;
    }

    public void setMaximumLoadBalancerRuleCount(Integer maximumLoadBalancerRuleCount) {
      this.maximumLoadBalancerRuleCount = maximumLoadBalancerRuleCount;
    }
    
    public String getPrimaryAvailabilitySetName() {
        return this.primaryAvailabilitySetName;
    }

    public void setPrimaryAvailabilitySetName(String primaryAvailabilitySetName) {
      this.primaryAvailabilitySetName = primaryAvailabilitySetName;
    }
    
    public String getPrimaryScaleSetName() {
        return this.primaryScaleSetName;
    }

    public void setPrimaryScaleSetName(String primaryScaleSetName) {
      this.primaryScaleSetName = primaryScaleSetName;
    }
    
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public void setResourceGroup(String resourceGroup) {
      this.resourceGroup = resourceGroup;
    }
    
    public String getRouteTableName() {
        return this.routeTableName;
    }

    public void setRouteTableName(String routeTableName) {
      this.routeTableName = routeTableName;
    }
    
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
      this.securityGroupName = securityGroupName;
    }
    
    public String getSubnetName() {
        return this.subnetName;
    }

    public void setSubnetName(String subnetName) {
      this.subnetName = subnetName;
    }
    
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
    }
    
    public String getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
    }
    
    public Boolean getUseInstanceMetadata() {
        return this.useInstanceMetadata;
    }

    public void setUseInstanceMetadata(Boolean useInstanceMetadata) {
      this.useInstanceMetadata = useInstanceMetadata;
    }
    
    public Boolean getUseManagedIdentityExtension() {
        return this.useManagedIdentityExtension;
    }

    public void setUseManagedIdentityExtension(Boolean useManagedIdentityExtension) {
      this.useManagedIdentityExtension = useManagedIdentityExtension;
    }
    
    public String getVmType() {
        return this.vmType;
    }

    public void setVmType(String vmType) {
      this.vmType = vmType;
    }
    
    public String getVnetName() {
        return this.vnetName;
    }

    public void setVnetName(String vnetName) {
      this.vnetName = vnetName;
    }
    
    public String getVnetResourceGroup() {
        return this.vnetResourceGroup;
    }

    public void setVnetResourceGroup(String vnetResourceGroup) {
      this.vnetResourceGroup = vnetResourceGroup;
    }
    
}
