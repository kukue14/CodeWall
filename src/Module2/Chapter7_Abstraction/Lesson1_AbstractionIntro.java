package Module2.Chapter7_Abstraction;

public class Lesson1_AbstractionIntro {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.hisJob();

        Person1 person2 = new Person1();
        person2.hisJob();
    }
}

class Person1 {
    void hisJob() {
        System.out.println("Writing");
    }
}


// Abstract
// Interface