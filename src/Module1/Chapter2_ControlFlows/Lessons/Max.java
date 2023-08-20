package Module1.Chapter2_ControlFlows.Lessons;

public class Max {
    public static void main(String[] args) {
        int num1 = 2000, num2 = 3000, num3 = 4000;
        System.out.print("Maximum number is : ");
        if(num1 > num2) {
            if(num1 > num3) {
                System.out.println(num1);
            } else {
                System.out.println(num3);
            }
        } else {
            if(num2 > num3) {
                System.out.println(num2);
            } else {
                System.out.println(num3);
            }
        }
    }
}
