package Module2.Chapter7_Abstraction;

//interface Calculator{
//    void cal(int number1,int number2);
//}
//
//public class Lesson6DifferentMethods {
//
//    void calculate(int a,int b,Calculator calculator){
//        calculator.cal(a,b);
////        System.out.println(a+b);
//    };
//
//    public static void main(String[] args) {
//        Lesson6DifferentMethods obj = new Lesson6DifferentMethods();
//        obj.calculate(10, 20, new Calculator() {
//            @Override
//            public void cal(int num1,int num2) {
//                System.out.println(num1+num2);
//            }
//        });
//
//        obj.calculate(20, 10, new Calculator() {
//            @Override
//            public void cal(int num1,int num2) {
//                System.out.println(num1-num2);
//            }
//        });
//
//        obj.calculate(10, 20, new Calculator() {
//            @Override
//            public void cal(int num1,int num2) {
//                System.out.println(num1*num2);
//            }
//        });
//
//
//
//
//
//
//
//
//
//    }
//
//}


abstract class Testable1{
    abstract void test1();
}
interface Testing{
//        void test(String f,String l);
    void test(String name);
}

public class Lesson6_DifferentMethods {

    void show(String name,Testing testing){
//        System.out.println("My name is "+  name);

        testing.test(name);
    }

//    void show(String fname,String lname,Testing objFromTesting){
////        String firstName = "Thura";
////        String lastName = " Linn";
////        System.out.println("My name is "+firstName+lastName);
//
////        System.out.println(fname+lname);
//
//        objFromTesting.test(fname,lname);
//
//
//    }

    public static void main(String[] args) {
//        Lesson6DifferentMethods obj = new Lesson6DifferentMethods();
//        obj.show("Thura", " Linn", new Testing() {
//            @Override
//            public void test(String first,String last) {
//                String fullName = first+" "+last;
//                System.out.println(fullName);
//                System.out.println(fullName.length());
//            }
//        });
//
//
//
//        Lesson6DifferentMethods obj1= new Lesson6DifferentMethods();
//        obj1.show("Han Htut ", "San", new Testing() {
//            @Override
//            public void test(String f,String l) {
//                String fName = f+" "+l;
//                System.out.println(fName.toUpperCase());
//            }
//        });

        Lesson6_DifferentMethods obj = new Lesson6_DifferentMethods();
        obj.show("Thura Linn", new Testing() {
            @Override
            public void test(String n) {
                System.out.println(n.length());
            }
        });

        obj.show("Aung Aung", new Testing() {
            @Override
            public void test(String n) {
                System.out.println(n.toUpperCase());
            }
        });





    }
}



