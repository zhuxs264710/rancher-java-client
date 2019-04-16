package io.rancher.type.user;

import io.rancher.base.AbstractType;

public class SetPasswordInput extends AbstractType {
    
    private String newPassword;
    
    public String getNewPassword() {
        return this.newPassword;
    }

    public void setNewPassword(String newPassword) {
      this.newPassword = newPassword;
    }
    
}
