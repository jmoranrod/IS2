package kata1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person = (Math.random() < 0.5) ? new Person("Javi", new Date(91,6,2)) : new Person("aaa", new Date(00,0,1));
        System.out.println(person);
        System.out.println(person.getAge());
    }
    
}
