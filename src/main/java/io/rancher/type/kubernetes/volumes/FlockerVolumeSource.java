package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class FlockerVolumeSource extends AbstractType {
    
    private String datasetName;
    
    private String datasetUUID;
    
    public String getDatasetName() {
        return this.datasetName;
    }

    public void setDatasetName(String datasetName) {
      this.datasetName = datasetName;
    }
    
    public String getDatasetUUID() {
        return this.datasetUUID;
    }

    public void setDatasetUUID(String datasetUUID) {
      this.datasetUUID = datasetUUID;
    }
    
}
