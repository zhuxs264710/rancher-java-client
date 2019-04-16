package io.rancher.type.docker;

import io.rancher.base.AbstractType;
import java.util.List;

public class DockerInfo extends AbstractType {
    
    private String architecture;
    
    private String cgroupDriver;
    
    private Boolean debug;
    
    private String dockerRootDir;
    
    private String driver;
    
    private Boolean experimentalBuild;
    
    private String httpProxy;
    
    private String httpsProxy;
    
    private String indexServerAddress;
    
    private String kernelVersion;
    
    private List<String> labels;
    
    private String loggingDriver;
    
    private String name;
    
    private String noProxy;
    
    private String operatingSystem;
    
    private String osType;
    
    private String serverVersion;
    
    public String getArchitecture() {
        return this.architecture;
    }

    public void setArchitecture(String architecture) {
      this.architecture = architecture;
    }
    
    public String getCgroupDriver() {
        return this.cgroupDriver;
    }

    public void setCgroupDriver(String cgroupDriver) {
      this.cgroupDriver = cgroupDriver;
    }
    
    public Boolean getDebug() {
        return this.debug;
    }

    public void setDebug(Boolean debug) {
      this.debug = debug;
    }
    
    public String getDockerRootDir() {
        return this.dockerRootDir;
    }

    public void setDockerRootDir(String dockerRootDir) {
      this.dockerRootDir = dockerRootDir;
    }
    
    public String getDriver() {
        return this.driver;
    }

    public void setDriver(String driver) {
      this.driver = driver;
    }
    
    public Boolean getExperimentalBuild() {
        return this.experimentalBuild;
    }

    public void setExperimentalBuild(Boolean experimentalBuild) {
      this.experimentalBuild = experimentalBuild;
    }
    
    public String getHttpProxy() {
        return this.httpProxy;
    }

    public void setHttpProxy(String httpProxy) {
      this.httpProxy = httpProxy;
    }
    
    public String getHttpsProxy() {
        return this.httpsProxy;
    }

    public void setHttpsProxy(String httpsProxy) {
      this.httpsProxy = httpsProxy;
    }
    
    public String getIndexServerAddress() {
        return this.indexServerAddress;
    }

    public void setIndexServerAddress(String indexServerAddress) {
      this.indexServerAddress = indexServerAddress;
    }
    
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
      this.kernelVersion = kernelVersion;
    }
    
    public List<String> getLabels() {
        return this.labels;
    }

    public void setLabels(List<String> labels) {
      this.labels = labels;
    }
    
    public String getLoggingDriver() {
        return this.loggingDriver;
    }

    public void setLoggingDriver(String loggingDriver) {
      this.loggingDriver = loggingDriver;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNoProxy() {
        return this.noProxy;
    }

    public void setNoProxy(String noProxy) {
      this.noProxy = noProxy;
    }
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
    }
    
    public String getOsType() {
        return this.osType;
    }

    public void setOsType(String osType) {
      this.osType = osType;
    }
    
    public String getServerVersion() {
        return this.serverVersion;
    }

    public void setServerVersion(String serverVersion) {
      this.serverVersion = serverVersion;
    }
    
}
