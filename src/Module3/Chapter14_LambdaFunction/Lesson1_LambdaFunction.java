package module3.chapter14lambda_function;


//Functional Interface
interface Test{
    void show();


//    default void show1(){
//        System.out.println("show 1");
//    }

}

public class Lesson1_LambdaFunction {
    public static void main(String[] args) {

        //simple way
        Test test = new Test() {
            @Override
            public void show() {
                System.out.println("This is task1");
            }
        };
//        test.show();


        //erase
        Test test1 = ()-> {
                System.out.println("This is task 2");
                System.out.println("This is task 3");
        };
//        test1.show();

//        //shortcut
        Test test2 = ()-> System.out.println("This is task 4");
        test2.show();

//        //replace by ide
        Test test3 = () -> {
            System.out.println("This is task 5");
        };
        test3.show();



    }
}
