package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class LoadBalancerStatus extends AbstractType {
    
    private List<LoadBalancerIngress> ingress;
    
    public List<LoadBalancerIngress> getIngress() {
        return this.ingress;
    }

    public void setIngress(List<LoadBalancerIngress> ingress) {
      this.ingress = ingress;
    }
    
}
