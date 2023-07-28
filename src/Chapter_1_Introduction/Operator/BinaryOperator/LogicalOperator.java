package Chapter_1_Introduction.Operator.BinaryOperator;

public class LogicalOperator {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        boolean logic = true || false;
        System.out.println(logic);

        boolean logic2 = true && false;
        System.out.println(logic2);

        if (num1 < num2 || num1 == num2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
