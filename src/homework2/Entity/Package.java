package homework2.Entity;

public class Package {

    private Address addressSender;
    private Address addressRecipient;
    private PersonalData sender;
    private PersonalData recipient;
    private Double weight;
    private Double cost;

    public Package(Address addressSender,
                   Address addressRecipient,
                   PersonalData sender,
                   PersonalData recipient,
                   Double weight,
                   Double cost) {
        this.addressSender = addressSender;
        this.addressRecipient = addressRecipient;
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.cost = cost;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
