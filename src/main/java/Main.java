import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Main {

    public static void main(String... args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Wim Vancroonenburg"));
        personList.add(new Person("Arne Hellin"));
        personList.add(new Person("Brecht Opstaele"));
        personList.add(new Person("Toon keymeulen"));
        personList.add(new Person("Brecht Opstaele"));
        personList.add(new Person("Branko Wauters"));
        personList.add(new Person("Evelyn De Smet"));
        personList.add(new Person("Bryan Coulier"));
        personList.add(new Person("Tony Wauters"));
        personList.add(new Person("Veerle Taleman"));
        personList.add(new Person("Tibo Verdonck"));
        personList.add(new Person("Robbe De Groeve"));
        personList.add(new Person("Niels Van Landschoot"));
        personList.add(new Person("Sander De Sutter"));
        personList.add(new Person("Ute Naessens"));
        personList.add(new Person("Emile Combes"));
        personList.add(new Person("Martijn Vanderschelden"));
        personList.add(new Person("Thomas Vander Beke"));

        for(Person person : personList) {
            person.sayHi();
        }

        List<Group> groups = new ArrayList<>();

        Group adminGroup = new Group("Admin");
        adminGroup.addMember(new Person("Pieter Smet"));
        adminGroup.addMember(new Person("Wim Vancroonenburg"));
        adminGroup.addMember(new Person("Tony Wauters"));

        Group group1 = new Group("Group 1");
        group1.addMember(new Person("Niels Van Landschoot"));
        group1.addMember(new Person("Arne Hellin"));
        Group group7 = new Group( "Groep 7");
        group7.addMember(new Person("Ute Naessens"));


        Group group_2 = new Group(("groep 2"));
        group_2.addMember(new Person("Toon keymeulen"));
        group_2.addMember(new Person("Martijn Vanderschelden"));
        group_2.addMember(new Person("Emile Combes"));

        Group groep3 = new Group("groep 3");
        groep3.addMember(new Person("Lien Vermeulen"));
        groep3.addMember(new Person("Thomas Vander Beke"));
        groep3.addMember(new Person("Brecht Opstaele"));

        groups.addAll(Arrays.asList(adminGroup,group1,group_2,groep3,group7));



        for(Group g : groups) {
            g.sayHi();
        }

    }
}
