package Module2.Chapter9_misc;

public class Lesson5_WrapperClass {
    public static void main(String[] args) {
        Double dou = 2.0;
        System.out.println(dou);

//    Wrapper Class --> Float fl;

        Float fl;
        String str = "Ku Kue";

        int a = 3;
        Integer b = a;
        int c = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String data = "123";
        int result = Integer.parseInt(data);
        System.out.println(result);

        int number = 123;
        String result1 = String.valueOf(number);
        String result2 = Integer.toString(number);
        System.out.println(result1);
        System.out.println(result2);

    }

}
