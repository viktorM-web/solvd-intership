package homework2.Entity;

public class Contact {

    private Integer phoneNumber;
    private String email;

    public Contact(Integer phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
