package homework2.Entity;

public class Department {

    private Address address;
    private Contact contact;
    private Employee[] employees;
    private Equipment[] equipments;
    private Service[] services;
    private Letter[] letters;
    private Package[] packages;

    public Department(Address address,
                      Contact contact,
                      Employee[] employees,
                      Equipment[] equipments,
                      Service[] services,
                      Letter[] letters,
                      Package[] packages) {
        this.address = address;
        this.contact = contact;
        this.employees = employees;
        this.equipments = equipments;
        this.services = services;
        this.letters = letters;
        this.packages = packages;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Equipment[] getEquipments() {
        return equipments;
    }

    public void setEquipments(Equipment[] equipments) {
        this.equipments = equipments;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    public Letter[] getLetters() {
        return letters;
    }

    public void setLetters(Letter[] letters) {
        this.letters = letters;
    }

    public Package[] getPackages() {
        return packages;
    }

    public void setPackages(Package[] packages) {
        this.packages = packages;
    }
}
