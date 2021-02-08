import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Main {

    public static void main(String... args) {


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

        Group groep4 = new Group("Groep 4");
        groep4.addMember(new Person("Robbe De Groeve"));
        groep4.addMember(new Person("Sander De Sutter"));
        groep4.addMember(new Person("Tibo Verdonck"));


        Group group_2 = new Group(("groep 2"));
        group_2.addMember(new Person("Toon keymeulen"));
        group_2.addMember(new Person("Martijn Vanderschelden"));
        group_2.addMember(new Person("Emile Combes"));

        Group groep3 = new Group("groep 3");
        groep3.addMember(new Person("Lien Vermeulen"));
        groep3.addMember(new Person("Thomas Vander Beke"));
        groep3.addMember(new Person("Brecht Opstaele"));

        Group groep5 = new Group("Groep 5");
        groep5.addMember(new Person("Bryan Coulier"));
        groep5.addMember(new Person("Branko Wauters"));
        groups.add(groep5);

        Group groep6 = new Group("groep 6");
        groep6.addMember(new Person("Evelyn De Smet"));
        groep6.addMember(new Person("Veerle Taleman"));

        groups.addAll(Arrays.asList(adminGroup,group1,group_2,groep3,groep4,groep5,groep6,group7));


        for(Group g : groups) {
            g.sayHi();
        }

    }
}
