package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class GoogleKubernetesEngineConfig extends AbstractType {
    
    private String clusterIpv4Cidr;
    
    private String credential;
    
    private String description;
    
    private Integer diskSizeGb;
    
    private Boolean enableAlphaFeature;
    
    private Boolean enableHorizontalPodAutoscaling;
    
    private Boolean enableHttpLoadBalancing;
    
    private Boolean enableKubernetesDashboard;
    
    private Boolean enableLegacyAbac;
    
    private Boolean enableNetworkPolicyConfig;
    
    private Boolean enableStackdriverLogging;
    
    private Boolean enableStackdriverMonitoring;
    
    private String imageType;
    
    private Map<String, Object> labels;
    
    private List<String> locations;
    
    private String machineType;
    
    private String maintenanceWindow;
    
    private String masterVersion;
    
    private String network;
    
    private Integer nodeCount;
    
    private String nodeVersion;
    
    private String projectId;
    
    private String subNetwork;
    
    private String zone;
    
    public String getClusterIpv4Cidr() {
        return this.clusterIpv4Cidr;
    }

    public void setClusterIpv4Cidr(String clusterIpv4Cidr) {
      this.clusterIpv4Cidr = clusterIpv4Cidr;
    }
    
    public String getCredential() {
        return this.credential;
    }

    public void setCredential(String credential) {
      this.credential = credential;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }

    public void setDiskSizeGb(Integer diskSizeGb) {
      this.diskSizeGb = diskSizeGb;
    }
    
    public Boolean getEnableAlphaFeature() {
        return this.enableAlphaFeature;
    }

    public void setEnableAlphaFeature(Boolean enableAlphaFeature) {
      this.enableAlphaFeature = enableAlphaFeature;
    }
    
    public Boolean getEnableHorizontalPodAutoscaling() {
        return this.enableHorizontalPodAutoscaling;
    }

    public void setEnableHorizontalPodAutoscaling(Boolean enableHorizontalPodAutoscaling) {
      this.enableHorizontalPodAutoscaling = enableHorizontalPodAutoscaling;
    }
    
    public Boolean getEnableHttpLoadBalancing() {
        return this.enableHttpLoadBalancing;
    }

    public void setEnableHttpLoadBalancing(Boolean enableHttpLoadBalancing) {
      this.enableHttpLoadBalancing = enableHttpLoadBalancing;
    }
    
    public Boolean getEnableKubernetesDashboard() {
        return this.enableKubernetesDashboard;
    }

    public void setEnableKubernetesDashboard(Boolean enableKubernetesDashboard) {
      this.enableKubernetesDashboard = enableKubernetesDashboard;
    }
    
    public Boolean getEnableLegacyAbac() {
        return this.enableLegacyAbac;
    }

    public void setEnableLegacyAbac(Boolean enableLegacyAbac) {
      this.enableLegacyAbac = enableLegacyAbac;
    }
    
    public Boolean getEnableNetworkPolicyConfig() {
        return this.enableNetworkPolicyConfig;
    }

    public void setEnableNetworkPolicyConfig(Boolean enableNetworkPolicyConfig) {
      this.enableNetworkPolicyConfig = enableNetworkPolicyConfig;
    }
    
    public Boolean getEnableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }

    public void setEnableStackdriverLogging(Boolean enableStackdriverLogging) {
      this.enableStackdriverLogging = enableStackdriverLogging;
    }
    
    public Boolean getEnableStackdriverMonitoring() {
        return this.enableStackdriverMonitoring;
    }

    public void setEnableStackdriverMonitoring(Boolean enableStackdriverMonitoring) {
      this.enableStackdriverMonitoring = enableStackdriverMonitoring;
    }
    
    public String getImageType() {
        return this.imageType;
    }

    public void setImageType(String imageType) {
      this.imageType = imageType;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public List<String> getLocations() {
        return this.locations;
    }

    public void setLocations(List<String> locations) {
      this.locations = locations;
    }
    
    public String getMachineType() {
        return this.machineType;
    }

    public void setMachineType(String machineType) {
      this.machineType = machineType;
    }
    
    public String getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    public void setMaintenanceWindow(String maintenanceWindow) {
      this.maintenanceWindow = maintenanceWindow;
    }
    
    public String getMasterVersion() {
        return this.masterVersion;
    }

    public void setMasterVersion(String masterVersion) {
      this.masterVersion = masterVersion;
    }
    
    public String getNetwork() {
        return this.network;
    }

    public void setNetwork(String network) {
      this.network = network;
    }
    
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
      this.nodeCount = nodeCount;
    }
    
    public String getNodeVersion() {
        return this.nodeVersion;
    }

    public void setNodeVersion(String nodeVersion) {
      this.nodeVersion = nodeVersion;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getSubNetwork() {
        return this.subNetwork;
    }

    public void setSubNetwork(String subNetwork) {
      this.subNetwork = subNetwork;
    }
    
    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
      this.zone = zone;
    }
    
}
