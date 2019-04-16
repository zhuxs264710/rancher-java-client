package io.rancher.type.user;

import io.rancher.base.AbstractType;

public class ChangePasswordInput extends AbstractType {
    
    private String currentPassword;
    
    private String newPassword;
    
    public String getCurrentPassword() {
        return this.currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
      this.currentPassword = currentPassword;
    }
    
    public String getNewPassword() {
        return this.newPassword;
    }

    public void setNewPassword(String newPassword) {
      this.newPassword = newPassword;
    }
    
}
