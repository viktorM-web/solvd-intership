package homework2;

import homework2.Entity.Address;
import homework2.Entity.Contact;
import homework2.Entity.Department;
import homework2.Entity.Employee;
import homework2.Entity.Equipment;
import homework2.Entity.Letter;
import homework2.Entity.Package;
import homework2.Entity.PersonalData;
import homework2.Entity.Post;
import homework2.Entity.Service;

public class Runner {

    public static void main(String[] args) {

        Address addressPostOffice = new Address("Belarus", "Minsk", "Lenina", 36);
        Address address = new Address("Belarus", "Minsk", "Lenina", 55, 6);
        Address address1 = new Address("Russia", "Moscow", "Marcksa", 33, 12);

        Contact contactPostOffice = new Contact(1112233, "postOfficeMinskLinina36@gmail.com");

        PersonalData ivan = new PersonalData("Ivan", "Ivanov", "MP1112233");
        PersonalData mikhail = new PersonalData("Mikhail", "Mikhailov", "MP1112234");
        PersonalData sveta = new PersonalData("Sveta", "Svetikova", "MP1112235");
        PersonalData anastasia = new PersonalData("Anastasia", "Mikhailova", "MP1112236");
        PersonalData petr = new PersonalData("Petr", "Petrov", "MP1112237");

        Letter letter = new Letter(address, address1, mikhail, petr, "document");
        Letter letter2 = new Letter(address1, address, petr, mikhail, "document");

        homework2.Entity.Package package1 = new homework2.Entity.Package(address, address1, mikhail, petr, 5.30, 50.00);
        homework2.Entity.Package package2 = new homework2.Entity.Package(address1, address, petr, mikhail, 8.30, 65.30);

        Employee officeWorker = new Employee(sveta, Post.OFFICE_WORKER);
        Employee deliveryman = new Employee(ivan, Post.DELIVERYMAN);
        Employee director = new Employee(anastasia, Post.DIRECTOR);

        Equipment laptop1 = new Equipment("Laptop", "ID1001", director);
        Equipment laptop2 = new Equipment("Laptop", "ID1002", officeWorker);
        Equipment car = new Equipment("Volkswagen caddy", "ID1004", deliveryman);

        Service packaging = new Service("packing", 5.35);
        Service delivery = new Service("delivery", 10.50);
        Service expressDelivery = new Service("express delivery", 30.50);

        Department post = new Department(addressPostOffice,
                contactPostOffice,
                new Employee[]{officeWorker, deliveryman, director},
                new Equipment[]{laptop1, laptop2, car},
                new Service[]{packaging, delivery, expressDelivery},
                new Letter[]{letter, letter2},
                new Package[]{package1, package2});

    }
}
