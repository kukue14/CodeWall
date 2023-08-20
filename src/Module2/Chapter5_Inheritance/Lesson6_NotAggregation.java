package Module2.Chapter5_Inheritance;

public class Lesson6_NotAggregation {
    public static void main(String[] args) {
        Student student = new Student("Daik-U", "Aung Chan Thar Street", 10, 22348, "Ku Kue", 19);
        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.number);
        System.out.println(student.street);
        System.out.println(student.city);
    }
}

class Address {
    String city;
    String street;
    int number;
    public Address(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }
}

class Student extends Address {
    int id;
    String name;
    int age;
    public Student(String city, String street, int number, int id, String name, int age) {
        super(city, street, number);
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
