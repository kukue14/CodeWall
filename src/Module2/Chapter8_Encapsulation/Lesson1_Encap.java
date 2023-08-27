package Module2.Chapter8_Encapsulation;

public class Lesson1_Encap {
    public static void main(String[] args) {
        Person person = new Person(24, "Ku Kue");
        System.out.println(person.getId());
        System.out.println(person.getName());
        person.setId(14);
        person.setName("Ku Kue Lite");
        System.out.println(person.getId());
        System.out.println(person.getName());
    }
}

class Person {
    private int id;
    private String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
