import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Main {

    public static void main(String... args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Pieter Smet"));
        personList.add(new Person("Wim Vancroonenburg"));
        personList.add(new Person("Arne Hellin"));
        personList.add(new Person("Branko Wauters"));
        for(Person person : personList) {
            person.sayHi();
        }
    }
}
