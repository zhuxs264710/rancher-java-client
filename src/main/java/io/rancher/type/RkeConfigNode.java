package io.rancher.type;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.RkeConfigNodeRoleEnum;

public class RkeConfigNode extends AbstractType {
    
    private String address;
    
    private String dockerSocket;
    
    private String hostnameOverride;
    
    private String internalAddress;
    
    private Map<String, Object> labels;
    
    private String nodeId;
    
    private String port;
    
    private List<RkeConfigNodeRoleEnum> role;
    
    private Boolean sshAgentAuth;
    
    private String sshKey;
    
    private String sshKeyPath;
    
    private String user;
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
    
    public String getDockerSocket() {
        return this.dockerSocket;
    }

    public void setDockerSocket(String dockerSocket) {
      this.dockerSocket = dockerSocket;
    }
    
    public String getHostnameOverride() {
        return this.hostnameOverride;
    }

    public void setHostnameOverride(String hostnameOverride) {
      this.hostnameOverride = hostnameOverride;
    }
    
    public String getInternalAddress() {
        return this.internalAddress;
    }

    public void setInternalAddress(String internalAddress) {
      this.internalAddress = internalAddress;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
      this.nodeId = nodeId;
    }
    
    public String getPort() {
        return this.port;
    }

    public void setPort(String port) {
      this.port = port;
    }
    
    public List<RkeConfigNodeRoleEnum> getRole() {
        return this.role;
    }

    public void setRole(List<RkeConfigNodeRoleEnum> role) {
      this.role = role;
    }
    
    public Boolean getSshAgentAuth() {
        return this.sshAgentAuth;
    }

    public void setSshAgentAuth(Boolean sshAgentAuth) {
      this.sshAgentAuth = sshAgentAuth;
    }
    
    public String getSshKey() {
        return this.sshKey;
    }

    public void setSshKey(String sshKey) {
      this.sshKey = sshKey;
    }
    
    public String getSshKeyPath() {
        return this.sshKeyPath;
    }

    public void setSshKeyPath(String sshKeyPath) {
      this.sshKeyPath = sshKeyPath;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
}
