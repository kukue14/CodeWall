package Module3.Chapter14_LambdaFunction;


interface Writable{
    void show(String name);
}
public class Lesson3_ChangeToMethodRef {
    public static void main(String[] args) {

        Writable writable = name -> System.out.println(name.toUpperCase());
        writable.show("Thura");


        Writable writable1 = System.out::println;
        writable1.show("Thura Linn");
    }
}
