package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Vmwarevsphereconfig extends AbstractType {
    
    private String boot2dockerUrl;
    
    private List<String> cfgparam;
    
    private String cloudinit;
    
    private String cpuCount;
    
    private String datacenter;
    
    private String datastore;
    
    private String diskSize;
    
    private String folder;
    
    private String hostsystem;
    
    private String memorySize;
    
    private List<String> network;
    
    private String String;
    
    private String pool;
    
    private String username;
    
    private String vcenter;
    
    private String vcenterPort;
    
    public String getBoot2dockerUrl() {
        return this.boot2dockerUrl;
    }

    public void setBoot2dockerUrl(String boot2dockerUrl) {
      this.boot2dockerUrl = boot2dockerUrl;
    }
    
    public List<String> getCfgparam() {
        return this.cfgparam;
    }

    public void setCfgparam(List<String> cfgparam) {
      this.cfgparam = cfgparam;
    }
    
    public String getCloudinit() {
        return this.cloudinit;
    }

    public void setCloudinit(String cloudinit) {
      this.cloudinit = cloudinit;
    }
    
    public String getCpuCount() {
        return this.cpuCount;
    }

    public void setCpuCount(String cpuCount) {
      this.cpuCount = cpuCount;
    }
    
    public String getDatacenter() {
        return this.datacenter;
    }

    public void setDatacenter(String datacenter) {
      this.datacenter = datacenter;
    }
    
    public String getDatastore() {
        return this.datastore;
    }

    public void setDatastore(String datastore) {
      this.datastore = datastore;
    }
    
    public String getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(String diskSize) {
      this.diskSize = diskSize;
    }
    
    public String getFolder() {
        return this.folder;
    }

    public void setFolder(String folder) {
      this.folder = folder;
    }
    
    public String getHostsystem() {
        return this.hostsystem;
    }

    public void setHostsystem(String hostsystem) {
      this.hostsystem = hostsystem;
    }
    
    public String getMemorySize() {
        return this.memorySize;
    }

    public void setMemorySize(String memorySize) {
      this.memorySize = memorySize;
    }
    
    public List<String> getNetwork() {
        return this.network;
    }

    public void setNetwork(List<String> network) {
      this.network = network;
    }
    
    public String getString() {
        return this.String;
    }

    public void setString(String String) {
      this.String = String;
    }
    
    public String getPool() {
        return this.pool;
    }

    public void setPool(String pool) {
      this.pool = pool;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
    public String getVcenter() {
        return this.vcenter;
    }

    public void setVcenter(String vcenter) {
      this.vcenter = vcenter;
    }
    
    public String getVcenterPort() {
        return this.vcenterPort;
    }

    public void setVcenterPort(String vcenterPort) {
      this.vcenterPort = vcenterPort;
    }
    
}
