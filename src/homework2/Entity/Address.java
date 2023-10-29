package homework2.Entity;

public class Address {

    private String country;
    private String city;
    private String street;
    private Integer house;
    private Integer apartment;

    public Address(String country,
                   String city,
                   String street,
                   Integer house,
                   Integer apartment) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public Address(String country,
                   String city,
                   String street,
                   Integer house) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Integer getApartment() {
        return apartment;
    }

    public void setApartment(Integer apartment) {
        this.apartment = apartment;
    }
}
