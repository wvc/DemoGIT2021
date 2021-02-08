import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Person> members = new ArrayList<>();
    private String name;

    public Group(String name) {
        this.name = name;
    }

    public void addMember(Person member) {
        this.members.add(member);
    }

    public void sayHi() {
        System.out.printf("This is group %s:\n",name);
        for(Person p : members) {
            System.out.printf(" - %s\n",p.getName());
        }
    }
}
