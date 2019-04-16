package io.rancher.type.cloudprovider;

import io.rancher.base.AbstractType;
import io.rancher.type.cloudprovider.aws.AwsCloudProvider;
import io.rancher.type.cloudprovider.azure.AzureCloudProvider;

public class CloudProvider extends AbstractType {
    
    private AwsCloudProvider awsCloudProvider;
    
    private AzureCloudProvider azureCloudProvider;
    
    private String customCloudProvider;
    
    private String name;
    
//    private OpenstackCloudProvider openstackCloudProvider;
//    
//    private VsphereCloudProvider vsphereCloudProvider;
    
    public AwsCloudProvider getAwsCloudProvider() {
        return this.awsCloudProvider;
    }

    public void setAwsCloudProvider(AwsCloudProvider awsCloudProvider) {
      this.awsCloudProvider = awsCloudProvider;
    }
    
    public AzureCloudProvider getAzureCloudProvider() {
        return this.azureCloudProvider;
    }

    public void setAzureCloudProvider(AzureCloudProvider azureCloudProvider) {
      this.azureCloudProvider = azureCloudProvider;
    }
    
    public String getCustomCloudProvider() {
        return this.customCloudProvider;
    }

    public void setCustomCloudProvider(String customCloudProvider) {
      this.customCloudProvider = customCloudProvider;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
//    public OpenstackCloudProvider getOpenstackCloudProvider() {
//        return this.openstackCloudProvider;
//    }
//
//    public void setOpenstackCloudProvider(OpenstackCloudProvider openstackCloudProvider) {
//      this.openstackCloudProvider = openstackCloudProvider;
//    }
//    
//    public VsphereCloudProvider getVsphereCloudProvider() {
//        return this.vsphereCloudProvider;
//    }
//
//    public void setVsphereCloudProvider(VsphereCloudProvider vsphereCloudProvider) {
//      this.vsphereCloudProvider = vsphereCloudProvider;
//    }
//    
}
