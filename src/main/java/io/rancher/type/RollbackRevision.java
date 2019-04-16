package io.rancher.type;

import io.rancher.base.AbstractType;

public class RollbackRevision extends AbstractType {
    
    private String revisionId;
    
    public String getRevisionId() {
        return this.revisionId;
    }

    public void setRevisionId(String revisionId) {
      this.revisionId = revisionId;
    }
    
}
