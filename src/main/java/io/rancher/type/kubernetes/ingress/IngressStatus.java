package io.rancher.type.kubernetes.ingress;

import io.rancher.base.AbstractType;
import io.rancher.type.LoadBalancerStatus;

public class IngressStatus extends AbstractType {
    
    private LoadBalancerStatus loadBalancer;
    
    public LoadBalancerStatus getLoadBalancer() {
        return this.loadBalancer;
    }

    public void setLoadBalancer(LoadBalancerStatus loadBalancer) {
      this.loadBalancer = loadBalancer;
    }
    
}
