package io.rancher.type.kubernetes.pod;

import io.rancher.base.AbstractType;
import java.util.List;

public class PodDNSConfig extends AbstractType {
    
    private List<String> nameservers;
    
    private List<PodDNSConfigOption> options;
    
    private List<String> searches;
    
    public List<String> getNameservers() {
        return this.nameservers;
    }

    public void setNameservers(List<String> nameservers) {
      this.nameservers = nameservers;
    }
    
    public List<PodDNSConfigOption> getOptions() {
        return this.options;
    }

    public void setOptions(List<PodDNSConfigOption> options) {
      this.options = options;
    }
    
    public List<String> getSearches() {
        return this.searches;
    }

    public void setSearches(List<String> searches) {
      this.searches = searches;
    }
    
}
