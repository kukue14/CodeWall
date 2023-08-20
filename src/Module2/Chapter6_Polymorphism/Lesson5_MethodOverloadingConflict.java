package Module2.Chapter6_Polymorphism;

public class Lesson5_MethodOverloadingConflict {
    static void cal(int a,double b){
        System.out.println(a);
        System.out.println(b);
    }
//
    static void cal(double a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
//        cal(5,6);
    }
}
