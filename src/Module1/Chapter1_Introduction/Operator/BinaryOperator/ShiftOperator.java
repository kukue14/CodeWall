package Module1.Chapter1_Introduction.Operator.BinaryOperator;

public class ShiftOperator {
    public static void main(String[] args) {
        int result1 = 10 << 2; // 1 0 1 0  0 0 = 2^5 + 2^3 = 40 <shortcut> 10 * 2^2 (first num * 2^<second num>)
        System.out.println(result1);

        int result2 = 10 >> 2; // 0 0 1 0 <1 0> = 2^1 = 2 <shortcut> 10 / 2*2 (first num / 2^<second num>)
        System.out.println(result2);

        int result3 = 15 << 3;
        System.out.println(result3);

        int result4 = 30 >> 2;
        System.out.println(result4);
    }
}
