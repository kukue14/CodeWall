package Module2.Chapter5_Inheritance;

public class Lesson7_Aggregation {
    public static void main(String[] args) {
        Address1 address1 = new Address1("Aung Chan Thar Street", "Bago", 100);
        Info info = new Info("Ku Kue", 12345, 20);

        Student1 student1 = new Student1(address1, info);
        student1.show();

//        Student1 student1 = new Student1(address1, info);
//        System.out.println(student1.address1.street);
//        System.out.println(student1.address1.city);
//        System.out.println(student1.address1.home_no);
//        System.out.println(student1.info.name);
//        System.out.println(student1.info.id);
//        System.out.println(student1.info.age);
    }
}

class Address1 {
    String street;
    String city;
    int home_no;
    public Address1(String street, String city, int home_no) {
        this.street = street;
        this.city = city;
        this.home_no = home_no;
    }
}

class Info {
    String name;
    int id;
    int age;
    public Info(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

class Student1 {
    Address1 address1;
    Info info;
    public Student1(Address1 address1, Info info) {
        this.address1 = address1;
        this.info = info;
    }

    public void show() {
//        Student1 student1 = new Student1(address1, info);
        System.out.println(address1.street);
        System.out.println(address1.city);
        System.out.println(address1.home_no);
        System.out.println(info.name);
        System.out.println(info.id);
        System.out.println(info.age);

//        [OR]
//
//        Student1 student1 = new Student1(address1, info);
//        System.out.println(student1.address1.city);
//        System.out.println(student1.address1.street);
//        System.out.println(student1.address1.home_no);
//        System.out.println(student1.info.id);
//        System.out.println(student1.info.name);
//        System.out.println(student1.info.age);
    }
}

