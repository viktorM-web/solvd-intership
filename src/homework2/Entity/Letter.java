package homework2.Entity;

public class Letter {

    private Address addressSender;
    private Address addressRecipient;
    private PersonalData sender;
    private PersonalData recipient;
    private String content;

    public Letter(Address addressSender,
                  Address addressRecipient,
                  PersonalData sender,
                  PersonalData recipient,
                  String content) {
        this.addressSender = addressSender;
        this.addressRecipient = addressRecipient;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public Address getAddressSender() {
        return addressSender;
    }

    public void setAddressSender(Address addressSender) {
        this.addressSender = addressSender;
    }

    public Address getAddressRecipient() {
        return addressRecipient;
    }

    public void setAddressRecipient(Address addressRecipient) {
        this.addressRecipient = addressRecipient;
    }

    public PersonalData getSender() {
        return sender;
    }

    public void setSender(PersonalData sender) {
        this.sender = sender;
    }

    public PersonalData getRecipient() {
        return recipient;
    }

    public void setRecipient(PersonalData recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
