package io.rancher.type.docker.container;

import java.util.List;
import java.util.Map;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.ContainerCapAddEnum;
import io.rancher.model.enums.ContainerCapDropEnum;
import io.rancher.type.EnvironmentFrom;
import io.rancher.type.Handler;
import io.rancher.type.Probe;
import io.rancher.type.ResourceRequirements;
import io.rancher.type.kubernetes.volumes.VolumeDevice;
import io.rancher.type.kubernetes.volumes.VolumeMount;

public class Container extends AbstractType {
    
    private Boolean allowPrivilegeEscalation;
    
    private List<ContainerCapAddEnum> capAdd;
    
    private List<ContainerCapDropEnum> capDrop;
    
    private List<String> command;
    
    private List<String> entrypoint;
    
    private Map<String, Object> environment;
    
    private List<EnvironmentFrom> environmentFrom;
    
    private Integer exitCode;
    
    private String image;
    
    private String imagePullPolicy;
    
    private Boolean initContainer;
    
    private Probe livenessProbe;
    
    private String name;
    
    private List<ContainerPort> ports;
    
    private Handler postStart;
    
    private Handler preStop;
    
    private Boolean privileged;
    
    private Boolean readOnly;
    
    private Probe readinessProbe;
    
    private ResourceRequirements resources;
    
    private Integer restartCount;
    
    private Integer runAsGroup;
    
    private Boolean runAsNonRoot;
    
    private String state;
    
    private Boolean stdin;
    
    private Boolean stdinOnce;
    
    private String terminationMessagePath;
    
    private String terminationMessagePolicy;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Boolean tty;
    
    private Integer uid;
    
    private List<VolumeDevice> volumeDevices;
    
    private List<VolumeMount> volumeMounts;
    
    private String workingDir;
    
    public Boolean getAllowPrivilegeEscalation() {
        return this.allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
      this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }
    
    public List<ContainerCapAddEnum> getCapAdd() {
        return this.capAdd;
    }

    public void setCapAdd(List<ContainerCapAddEnum> capAdd) {
      this.capAdd = capAdd;
    }
    
    public List<ContainerCapDropEnum> getCapDrop() {
        return this.capDrop;
    }

    public void setCapDrop(List<ContainerCapDropEnum> capDrop) {
      this.capDrop = capDrop;
    }
    
    public List<String> getCommand() {
        return this.command;
    }

    public void setCommand(List<String> command) {
      this.command = command;
    }
    
    public List<String> getEntrypoint() {
        return this.entrypoint;
    }

    public void setEntrypoint(List<String> entrypoint) {
      this.entrypoint = entrypoint;
    }
    
    public Map<String, Object> getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(Map<String, Object> environment) {
      this.environment = environment;
    }
    
    public List<EnvironmentFrom> getEnvironmentFrom() {
        return this.environmentFrom;
    }

    public void setEnvironmentFrom(List<EnvironmentFrom> environmentFrom) {
      this.environmentFrom = environmentFrom;
    }
    
    public Integer getExitCode() {
        return this.exitCode;
    }

    public void setExitCode(Integer exitCode) {
      this.exitCode = exitCode;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getImagePullPolicy() {
        return this.imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
      this.imagePullPolicy = imagePullPolicy;
    }
    
    public Boolean getInitContainer() {
        return this.initContainer;
    }

    public void setInitContainer(Boolean initContainer) {
      this.initContainer = initContainer;
    }
    
    public Probe getLivenessProbe() {
        return this.livenessProbe;
    }

    public void setLivenessProbe(Probe livenessProbe) {
      this.livenessProbe = livenessProbe;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<ContainerPort> getPorts() {
        return this.ports;
    }

    public void setPorts(List<ContainerPort> ports) {
      this.ports = ports;
    }
    
    public Handler getPostStart() {
        return this.postStart;
    }

    public void setPostStart(Handler postStart) {
      this.postStart = postStart;
    }
    
    public Handler getPreStop() {
        return this.preStop;
    }

    public void setPreStop(Handler preStop) {
      this.preStop = preStop;
    }
    
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public void setPrivileged(Boolean privileged) {
      this.privileged = privileged;
    }
    
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
      this.readOnly = readOnly;
    }
    
    public Probe getReadinessProbe() {
        return this.readinessProbe;
    }

    public void setReadinessProbe(Probe readinessProbe) {
      this.readinessProbe = readinessProbe;
    }
    
    public ResourceRequirements getResources() {
        return this.resources;
    }

    public void setResources(ResourceRequirements resources) {
      this.resources = resources;
    }
    
    public Integer getRestartCount() {
        return this.restartCount;
    }

    public void setRestartCount(Integer restartCount) {
      this.restartCount = restartCount;
    }
    
    public Integer getRunAsGroup() {
        return this.runAsGroup;
    }

    public void setRunAsGroup(Integer runAsGroup) {
      this.runAsGroup = runAsGroup;
    }
    
    public Boolean getRunAsNonRoot() {
        return this.runAsNonRoot;
    }

    public void setRunAsNonRoot(Boolean runAsNonRoot) {
      this.runAsNonRoot = runAsNonRoot;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public Boolean getStdin() {
        return this.stdin;
    }

    public void setStdin(Boolean stdin) {
      this.stdin = stdin;
    }
    
    public Boolean getStdinOnce() {
        return this.stdinOnce;
    }

    public void setStdinOnce(Boolean stdinOnce) {
      this.stdinOnce = stdinOnce;
    }
    
    public String getTerminationMessagePath() {
        return this.terminationMessagePath;
    }

    public void setTerminationMessagePath(String terminationMessagePath) {
      this.terminationMessagePath = terminationMessagePath;
    }
    
    public String getTerminationMessagePolicy() {
        return this.terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
      this.terminationMessagePolicy = terminationMessagePolicy;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public Boolean getTty() {
        return this.tty;
    }

    public void setTty(Boolean tty) {
      this.tty = tty;
    }
    
    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
      this.uid = uid;
    }
    
    public List<VolumeDevice> getVolumeDevices() {
        return this.volumeDevices;
    }

    public void setVolumeDevices(List<VolumeDevice> volumeDevices) {
      this.volumeDevices = volumeDevices;
    }
    
    public List<VolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }

    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
      this.volumeMounts = volumeMounts;
    }
    
    public String getWorkingDir() {
        return this.workingDir;
    }

    public void setWorkingDir(String workingDir) {
      this.workingDir = workingDir;
    }
    
}
