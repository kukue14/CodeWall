package Chapter_2.Control_Flow;

public class IfStatement {
    public static void main(String[] args) {
        int a = 3;

//        if
        if (a > 0) {
            System.out.println("a is greater than 0.");
        }

//        if else
        if (a < 0) {
            System.out.println("a is less than 0.");
        } else {
            System.out.println("a is greater than 0.");
        }

//        if else if
        if (a > 0) {
            System.out.println("a is greater than 0.");
        } else if (a < 0) {
            System.out.println("a is less than 0.");
        } else {
            System.out.println("a is 0.");
        }
    }
}
