package io.rancher.type.kubernetes.ingress;

import io.rancher.base.AbstractType;
import java.util.List;

public class IngressBackend extends AbstractType {
    
    private String serviceId;
    
    private Integer targetPort;
    
    private List<String> workloadIds;
    
    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
    }
    
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public void setTargetPort(Integer targetPort) {
      this.targetPort = targetPort;
    }
    
    public List<String> getWorkloadIds() {
        return this.workloadIds;
    }

    public void setWorkloadIds(List<String> workloadIds) {
      this.workloadIds = workloadIds;
    }
    
}
