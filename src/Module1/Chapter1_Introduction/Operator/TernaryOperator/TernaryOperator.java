package Module1.Chapter1_Introduction.Operator.TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {
        int result = (10 > 5) ? 10 : 5;
        System.out.println(result);

        String str = (10 < 30) ? "It's is true." : "It's false.";
        System.out.println(str);

        boolean bool = (20 < 40) ? false : true;
        System.out.println(bool);

        Object crazy = (20 > 10) ? "Right" : false;
        System.out.println(crazy);
    }
}
