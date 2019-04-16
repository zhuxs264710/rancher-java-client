package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class EtcdService extends AbstractType {
    
    private String caCert;
    
    private String cert;
    
    private String creation;
    
    private List<String> externalUrls;
    
    private Map<String, Object> extraArgs;
    
    private List<String> extraBinds;
    
    private List<String> extraEnv;
    
    private String image;
    
    private String key;
    
    private String path;
    
    private String retention;
    
    private Boolean snapshot;
    
    public String getCaCert() {
        return this.caCert;
    }

    public void setCaCert(String caCert) {
      this.caCert = caCert;
    }
    
    public String getCert() {
        return this.cert;
    }

    public void setCert(String cert) {
      this.cert = cert;
    }
    
    public String getCreation() {
        return this.creation;
    }

    public void setCreation(String creation) {
      this.creation = creation;
    }
    
    public List<String> getExternalUrls() {
        return this.externalUrls;
    }

    public void setExternalUrls(List<String> externalUrls) {
      this.externalUrls = externalUrls;
    }
    
    public Map<String, Object> getExtraArgs() {
        return this.extraArgs;
    }

    public void setExtraArgs(Map<String, Object> extraArgs) {
      this.extraArgs = extraArgs;
    }
    
    public List<String> getExtraBinds() {
        return this.extraBinds;
    }

    public void setExtraBinds(List<String> extraBinds) {
      this.extraBinds = extraBinds;
    }
    
    public List<String> getExtraEnv() {
        return this.extraEnv;
    }

    public void setExtraEnv(List<String> extraEnv) {
      this.extraEnv = extraEnv;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
      this.key = key;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public String getRetention() {
        return this.retention;
    }

    public void setRetention(String retention) {
      this.retention = retention;
    }
    
    public Boolean getSnapshot() {
        return this.snapshot;
    }

    public void setSnapshot(Boolean snapshot) {
      this.snapshot = snapshot;
    }
    
}
