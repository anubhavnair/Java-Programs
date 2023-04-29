class Student {

    String Name;
    int Age;

    public void info() {
        System.out.print(this.Name + " " + this.Age);

    }

    Student(String a, int b) {
        this.Name = a;
        this.Age = b;

    }

    Student() {

    }
}

public class ObjectAndClasses {

    public static void main(String args[]) {

        Student s1 = new Student("Anubhav ", 22);

        s1.info();
        Student s2 = new Student();

    }
}