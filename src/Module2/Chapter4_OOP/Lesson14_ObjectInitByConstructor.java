package Module2.Chapter4_OOP;

import Formats.FormatLite;

public class Lesson14_ObjectInitByConstructor {
    public static void main(String[] args) {
        Employee obj = new Employee("Ku Kue", 1000000000, "Programmer");
        System.out.println(obj.name);
        System.out.println(obj.salary);
        System.out.println(obj.position);
        FormatLite.Underline('=', 50);
        obj.show();
    }
}

class Employee {
    String name;
    int salary;
    String position;
    Employee(String name, int salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }
    void show() {
        System.out.println("Employee name is " + name);
        System.out.println("Employee salary is " + salary);
        System.out.println("Employee position is " + position);
    }
}
