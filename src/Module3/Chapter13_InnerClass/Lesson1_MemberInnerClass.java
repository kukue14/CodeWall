package Module3.Chapter13_InnerClass;


public class Lesson1_MemberInnerClass {
    private int lessonData = 20;
    class inner{
        void show() {
            System.out.println("Ressult is " + lessonData);
        }
    }

    public static void main(String[] args) {

        Lesson1_MemberInnerClass obj = new Lesson1_MemberInnerClass();
        Lesson1_MemberInnerClass.inner innerObj = new Lesson1_MemberInnerClass();


    }
}

class A {
    static int a = 5;
}

class C {
    public static void main(String[] args) {

    }
}


