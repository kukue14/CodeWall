package Module2.Chapter9_misc;

class A1 {
    int num;
    A1(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return Integer.toString(num);
//        return String.valueOf(num);
    }
}
public class Lesson6_CustomWrapperClass {
    public static void main(String[] args) {
        A1 num1 = new A1(5);
        A1 num2 = new A1(10);
        System.out.println(num1);
        System.out.println(num2);
    }
}
