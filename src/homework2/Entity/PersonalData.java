package homework2.Entity;

public class PersonalData {

    private String name;
    private String surname;
    private String passport;

    public PersonalData(String name, String surname, String passport) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
