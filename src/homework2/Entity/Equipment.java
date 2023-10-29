package homework2.Entity;

public class Equipment {

    private String name;
    private String number;
    private Employee responsible;

    public Equipment(String name, String number, Employee responsible) {
        this.name = name;
        this.number = number;
        this.responsible = responsible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Employee getResponsible() {
        return responsible;
    }

    public void setResponsible(Employee responsible) {
        this.responsible = responsible;
    }
}
