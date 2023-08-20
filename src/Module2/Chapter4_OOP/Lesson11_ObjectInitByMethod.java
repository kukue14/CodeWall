package Module2.Chapter4_OOP;

public class Lesson11_ObjectInitByMethod {
    public static void main(String[] args) {
        Student1 stu1 = new Student1();
        Student1 stu2 = new Student1();

        stu1.putData("Ku Kue", 19, 'B');
        stu2.putData("Soe Sett Lynn", 19, 'B');

        System.out.println(stu1.name + " is " + stu1.age + " years old and he is in Section-" + stu1.classroom);
        System.out.println(stu2.name + " is " + stu2.age + " years old and he is in Section-" + stu2.classroom);
    }
}

class Student1 {
    String name;
    int age;
    char classroom;
    void putData(String name, int age, char cr) {
        this.name = name;
        this.age = age;
        classroom = cr;
    }
}
