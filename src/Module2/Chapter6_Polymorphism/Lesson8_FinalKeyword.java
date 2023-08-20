package Module2.Chapter6_Polymorphism;

public class Lesson8_FinalKeyword {



    public static final int NUMBER  = 591;


    public static void main(String[] args) {
        System.out.println(Math.PI);
    }

//    public static void main(String[] args) {
//        int a = 6;
//        a = 7;
//
//        final  int b ;
//        b = 9;
//
////        b = 10;
//
//
//       final String champion = "Fra";
////        champion = "Arg";
//    }
}

class Use{
    public static void main(String[] args) {


//        Lesson8FinalKeyword.NUMBER = 23;
        System.out.println(Lesson8_FinalKeyword.NUMBER);

        System.out.println(Math.PI);

    }
}
