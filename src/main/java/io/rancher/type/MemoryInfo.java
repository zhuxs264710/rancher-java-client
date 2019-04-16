package io.rancher.type;

import io.rancher.base.AbstractType;

public class MemoryInfo extends AbstractType {
    
    private Integer memTotalKiB;
    
    public Integer getMemTotalKiB() {
        return this.memTotalKiB;
    }

    public void setMemTotalKiB(Integer memTotalKiB) {
      this.memTotalKiB = memTotalKiB;
    }
    
}
