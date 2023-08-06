package Module1.Chapter1_Introduction.Operator.UnaryOperator;

public class OperatorTesting {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
//        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);

        System.out.println("------------------------------");
        int b = 5;
        System.out.println(b);
//        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);

        System.out.println("------------------------------");
        int c = 6;
        System.out.println(c);
        System.out.println(--c);
        System.out.println(c);
        System.out.println(c--);
        System.out.println(c);

        System.out.println("------------------------------");
        int d = 6;
        System.out.println(d);
        System.out.println(++d);
        System.out.println(d);
        System.out.println(d++);
        System.out.println(d);
    }
}
