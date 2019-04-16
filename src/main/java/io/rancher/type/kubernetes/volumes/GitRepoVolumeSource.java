package io.rancher.type.kubernetes.volumes;

import io.rancher.base.AbstractType;

public class GitRepoVolumeSource extends AbstractType {
    
    private String directory;
    
    private String repository;
    
    private String revision;
    
    public String getDirectory() {
        return this.directory;
    }

    public void setDirectory(String directory) {
      this.directory = directory;
    }
    
    public String getRepository() {
        return this.repository;
    }

    public void setRepository(String repository) {
      this.repository = repository;
    }
    
    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String revision) {
      this.revision = revision;
    }
    
}
