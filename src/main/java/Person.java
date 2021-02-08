public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHi() {
        System.out.printf("Hallo, ik ben %s\n",name);
    }
}
