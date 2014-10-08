package kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
    private final long MILLISECONDS_PER_YEAR = (long) (365.25*24*3600*1000);

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthday=" + birthday + '}';
    }

    public int getAge() {
        Date now = new Date();
        long ageInMilliSeconds = now.getTime() - birthday.getTime();
        return millisecondsToYears(ageInMilliSeconds);
    }

    private int millisecondsToYears(long ageInMiliseconds) {
        return (int) (ageInMiliseconds / MILLISECONDS_PER_YEAR);
    } 
}
