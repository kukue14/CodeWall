package Module2.Chapter4_OOP;

public class Lesson5_Student {
    int id;
    String name;
    int age;
    static String schoolName = "CodeWall";

    public static void main(String[] args) {
        Lesson5_Student s1 = new Lesson5_Student();
        s1.schoolName = "CW"; // = schoolName = "CW";
        Lesson5_Student s2 = new Lesson5_Student();
        s2.schoolName = "CodeWall Tech"; // = schoolName = "CodeWall Tech";

        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
    }
}
