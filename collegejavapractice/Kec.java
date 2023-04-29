import java.util.ArrayList;
import java.util.List;

class College {

    String clgname;
    String add;

    College(String clgname, String add) {
        this.clgname = clgname;
        this.add = add;

    }

    void printdetail() {
        System.out.println("collge name:" + clgname);
        System.out.println("Address is " + add);
    }

}

class University {

    private final List<College> Cg;

    University(List<College> Cg) {

        this.Cg = Cg;
    }

    public List<College> getTotal() {

        return (Cg);
    }

}

public class Kec {
    public static void main(String[] args) {
        long l=System.currentTimeMillis();

        College c1 = new College("Kec", "Bhilai");
        College c2 = new College("Rungta", "Raipur");
        College c3 = new College("CSIT", "durg");
        List<College> clg = new ArrayList<>();
        clg.add(c1);
        clg.add(c2);
        clg.add(c3);
        University u = new University(clg);
        List<College> li = u.getTotal();
        for (College a : clg) {
            System.out.println("name is" + a.clgname + " " + "add is" + a.add);
        }

        System.out.println(System.currentTimeMillis()-l);

    }

}
