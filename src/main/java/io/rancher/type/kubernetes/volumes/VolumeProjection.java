package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;
import io.rancher.type.kubernetes.DownwardAPIProjection;
import io.rancher.type.kubernetes.configmap.ConfigMapProjection;
import io.rancher.type.kubernetes.secret.SecretProjection;

public class VolumeProjection extends AbstractType {
    
    private ConfigMapProjection configMap;
    
    private DownwardAPIProjection downwardAPI;
    
    private SecretProjection secret;
    
    public ConfigMapProjection getConfigMap() {
        return this.configMap;
    }

    public void setConfigMap(ConfigMapProjection configMap) {
      this.configMap = configMap;
    }
    
    public DownwardAPIProjection getDownwardAPI() {
        return this.downwardAPI;
    }

    public void setDownwardAPI(DownwardAPIProjection downwardAPI) {
      this.downwardAPI = downwardAPI;
    }
    
    public SecretProjection getSecret() {
        return this.secret;
    }

    public void setSecret(SecretProjection secret) {
      this.secret = secret;
    }
    
}
