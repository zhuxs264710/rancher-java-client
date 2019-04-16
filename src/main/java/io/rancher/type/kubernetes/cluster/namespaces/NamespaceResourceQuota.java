package io.rancher.type.kubernetes.cluster.namespaces;

import io.rancher.base.AbstractType;
import io.rancher.type.ResourceQuotaLimit;

public class NamespaceResourceQuota extends AbstractType {
    
    private ResourceQuotaLimit limit;
    
    public ResourceQuotaLimit getLimit() {
        return this.limit;
    }

    public void setLimit(ResourceQuotaLimit limit) {
      this.limit = limit;
    }
    
}
