package io.rancher.type;

import io.rancher.base.AbstractType;

public class ResourceQuotaLimit extends AbstractType {
    
    private String configMaps;
    
    private String limitsCpu;
    
    private String limitsMemory;
    
    private String persistentVolumeClaims;
    
    private String pods;
    
    private String replicationControllers;
    
    private String requestsCpu;
    
    private String requestsMemory;
    
    private String requestsStorage;
    
    private String secrets;
    
    private String services;
    
    private String servicesLoadBalancers;
    
    private String servicesNodePorts;
    
    public String getConfigMaps() {
        return this.configMaps;
    }

    public void setConfigMaps(String configMaps) {
      this.configMaps = configMaps;
    }
    
    public String getLimitsCpu() {
        return this.limitsCpu;
    }

    public void setLimitsCpu(String limitsCpu) {
      this.limitsCpu = limitsCpu;
    }
    
    public String getLimitsMemory() {
        return this.limitsMemory;
    }

    public void setLimitsMemory(String limitsMemory) {
      this.limitsMemory = limitsMemory;
    }
    
    public String getPersistentVolumeClaims() {
        return this.persistentVolumeClaims;
    }

    public void setPersistentVolumeClaims(String persistentVolumeClaims) {
      this.persistentVolumeClaims = persistentVolumeClaims;
    }
    
    public String getPods() {
        return this.pods;
    }

    public void setPods(String pods) {
      this.pods = pods;
    }
    
    public String getReplicationControllers() {
        return this.replicationControllers;
    }

    public void setReplicationControllers(String replicationControllers) {
      this.replicationControllers = replicationControllers;
    }
    
    public String getRequestsCpu() {
        return this.requestsCpu;
    }

    public void setRequestsCpu(String requestsCpu) {
      this.requestsCpu = requestsCpu;
    }
    
    public String getRequestsMemory() {
        return this.requestsMemory;
    }

    public void setRequestsMemory(String requestsMemory) {
      this.requestsMemory = requestsMemory;
    }
    
    public String getRequestsStorage() {
        return this.requestsStorage;
    }

    public void setRequestsStorage(String requestsStorage) {
      this.requestsStorage = requestsStorage;
    }
    
    public String getSecrets() {
        return this.secrets;
    }

    public void setSecrets(String secrets) {
      this.secrets = secrets;
    }
    
    public String getServices() {
        return this.services;
    }

    public void setServices(String services) {
      this.services = services;
    }
    
    public String getServicesLoadBalancers() {
        return this.servicesLoadBalancers;
    }

    public void setServicesLoadBalancers(String servicesLoadBalancers) {
      this.servicesLoadBalancers = servicesLoadBalancers;
    }
    
    public String getServicesNodePorts() {
        return this.servicesNodePorts;
    }

    public void setServicesNodePorts(String servicesNodePorts) {
      this.servicesNodePorts = servicesNodePorts;
    }
    
}
