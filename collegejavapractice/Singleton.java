import java.net.SocketTimeoutException;

import javax.xml.crypto.Data;

class Database {
    private static Database obj;

    private Database() {
        System.out.println("constructor");

    }

    public static Database getInstance() { 

        if (obj == null) {
            obj = new Database();
        }
        return (obj);

    }
    public void display(){
        System.out.println("You are now connected to the Database");
    }

}

public class Singleton {
    public static void main(String[] args) {
        Database obj1;
        obj1=Database.getInstance();
        Database ob2=Database.getInstance();
        // obj2.hashCode();
        obj1.display();
       System.out.println(obj1.hashCode());
       System.out.println(ob2.hashCode());
    }

}
