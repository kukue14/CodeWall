package Module3.Chapter14_LambdaFunction;

interface Show{
    void display();
}

public class Lesson4_MethodRef {

    void fullName(){
        System.out.println("Thura Linn");
    }

    static void firstName(){
        System.out.println("Thura ");
    }


    public static void main(String[] args) {
       Show show = new Show() {
           @Override
           public void display() {
               System.out.println("This is task 1");
           }
       };
       show.display();



       Lesson4_MethodRef lesson4MethodRef = new Lesson4_MethodRef();

       Show show1 = () -> lesson4MethodRef.fullName();
       show1.display();



       Show show2 = lesson4MethodRef::fullName;


       Show show3 = () -> Lesson4_MethodRef.firstName();


       Show show4 = Lesson4_MethodRef::firstName;

    }
}
