package io.rancher.type.kubernetes.pod;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.type.FsGroupStrategyOptions;
import io.rancher.type.OwnerReference;
import io.rancher.type.RunAsUserStrategyOptions;
import io.rancher.type.SupplementalGroupsStrategyOptions;
import io.rancher.type.kubernetes.HostPortRange;
import io.rancher.type.kubernetes.SeLinuxStrategyOptions;
import io.rancher.type.kubernetes.volumes.AllowedFlexVolume;
import io.rancher.type.kubernetes.volumes.AllowedHostPath;

public class PodSecurityPolicyTemplate extends AbstractType {
    
    private Boolean allowPrivilegeEscalation;
    
    private List<String> allowedCapabilities;
    
    private List<AllowedFlexVolume> allowedFlexVolumes;
    
    private List<AllowedHostPath> allowedHostPaths;
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private List<String> defaultAddCapabilities;
    
    private Boolean defaultAllowPrivilegeEscalation;
    
    private String description;
    
    private FsGroupStrategyOptions fsGroup;
    
    private Boolean hostIPC;
    
    private Boolean hostNetwork;
    
    private Boolean hostPID;
    
    private List<HostPortRange> hostPorts;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private Boolean privileged;
    
    private Boolean readOnlyRootFilesystem;
    
    private String removed;
    
    private List<String> requiredDropCapabilities;
    
    private RunAsUserStrategyOptions runAsUser;
    
    private SeLinuxStrategyOptions seLinux;
    
    private SupplementalGroupsStrategyOptions supplementalGroups;
    
    private String uuid;
    
    private List<String> volumes;
    
    public Boolean getAllowPrivilegeEscalation() {
        return this.allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
      this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }
    
    public List<String> getAllowedCapabilities() {
        return this.allowedCapabilities;
    }

    public void setAllowedCapabilities(List<String> allowedCapabilities) {
      this.allowedCapabilities = allowedCapabilities;
    }
    
    public List<AllowedFlexVolume> getAllowedFlexVolumes() {
        return this.allowedFlexVolumes;
    }

    public void setAllowedFlexVolumes(List<AllowedFlexVolume> allowedFlexVolumes) {
      this.allowedFlexVolumes = allowedFlexVolumes;
    }
    
    public List<AllowedHostPath> getAllowedHostPaths() {
        return this.allowedHostPaths;
    }

    public void setAllowedHostPaths(List<AllowedHostPath> allowedHostPaths) {
      this.allowedHostPaths = allowedHostPaths;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public List<String> getDefaultAddCapabilities() {
        return this.defaultAddCapabilities;
    }

    public void setDefaultAddCapabilities(List<String> defaultAddCapabilities) {
      this.defaultAddCapabilities = defaultAddCapabilities;
    }
    
    public Boolean getDefaultAllowPrivilegeEscalation() {
        return this.defaultAllowPrivilegeEscalation;
    }

    public void setDefaultAllowPrivilegeEscalation(Boolean defaultAllowPrivilegeEscalation) {
      this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public FsGroupStrategyOptions getFsGroup() {
        return this.fsGroup;
    }

    public void setFsGroup(FsGroupStrategyOptions fsGroup) {
      this.fsGroup = fsGroup;
    }
    
    public Boolean getHostIPC() {
        return this.hostIPC;
    }

    public void setHostIPC(Boolean hostIPC) {
      this.hostIPC = hostIPC;
    }
    
    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
      this.hostNetwork = hostNetwork;
    }
    
    public Boolean getHostPID() {
        return this.hostPID;
    }

    public void setHostPID(Boolean hostPID) {
      this.hostPID = hostPID;
    }
    
    public List<HostPortRange> getHostPorts() {
        return this.hostPorts;
    }

    public void setHostPorts(List<HostPortRange> hostPorts) {
      this.hostPorts = hostPorts;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public void setPrivileged(Boolean privileged) {
      this.privileged = privileged;
    }
    
    public Boolean getReadOnlyRootFilesystem() {
        return this.readOnlyRootFilesystem;
    }

    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
      this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public List<String> getRequiredDropCapabilities() {
        return this.requiredDropCapabilities;
    }

    public void setRequiredDropCapabilities(List<String> requiredDropCapabilities) {
      this.requiredDropCapabilities = requiredDropCapabilities;
    }
    
    public RunAsUserStrategyOptions getRunAsUser() {
        return this.runAsUser;
    }

    public void setRunAsUser(RunAsUserStrategyOptions runAsUser) {
      this.runAsUser = runAsUser;
    }
    
    public SeLinuxStrategyOptions getSeLinux() {
        return this.seLinux;
    }

    public void setSeLinux(SeLinuxStrategyOptions seLinux) {
      this.seLinux = seLinux;
    }
    
    public SupplementalGroupsStrategyOptions getSupplementalGroups() {
        return this.supplementalGroups;
    }

    public void setSupplementalGroups(SupplementalGroupsStrategyOptions supplementalGroups) {
      this.supplementalGroups = supplementalGroups;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public List<String> getVolumes() {
        return this.volumes;
    }

    public void setVolumes(List<String> volumes) {
      this.volumes = volumes;
    }
    
}
