import java.nio.channels.ShutdownChannelGroupException;

 class Adress {
    String city;
    String State;
    String country;

    Adress() {
    }

    Adress(String city, String state, String country) {
        this.city = city;
        this.State = state;
        this.country = country;
    }

}

class Employee extends Adress {
    int eid;
    String name;

    Employee(int eid, String name, String city, String state, String country) {
        super(city, state, country);
        this.eid=eid;
        this.name=name;

    }

    void showDetails() {
        System.out.println("Employee Name is->" + " " + this.name);
        System.out.println("Employee Id is ->" + " " + this.eid);
        System.out.println("Address Is:");
        System.out.println("City->" + " " + this.city);
        System.out.println("State:" + " " + this.State);
        System.out.println("County:" + " " + this.country);
        System.out.println("<----------------------------------------------------------------------------------------------------->");

    }

}

public class EmployeeAndAddress {
    public static void main(String[] args) {

        Employee e1 = new Employee(1001, "TaraChand", "Kumhhari", "Chhattisgrh", "India");
        Employee e2 = new Employee(1002, "Vase", "Kumhhari", "Chhattisgrh", "Zimbave");
        Employee e3 = new Employee(1002, "Harsh", "Bhilai", "Chhattisgrh", "India");
        e1.showDetails();
        e2.showDetails();
        e3.showDetails();

    }

}
