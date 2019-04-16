package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.model.enums.RecipientNotifierTypeEnum;

public class Recipient extends AbstractType {
    
    private String notifierId;
    
    private RecipientNotifierTypeEnum notifierType;
    
    private String recipient;
    
    public String getNotifierId() {
        return this.notifierId;
    }

    public void setNotifierId(String notifierId) {
      this.notifierId = notifierId;
    }
    
    public RecipientNotifierTypeEnum getNotifierType() {
        return this.notifierType;
    }

    public void setNotifierType(RecipientNotifierTypeEnum notifierType) {
      this.notifierType = notifierType;
    }
    
    public String getRecipient() {
        return this.recipient;
    }

    public void setRecipient(String recipient) {
      this.recipient = recipient;
    }
    
}
