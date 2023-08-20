package Module2.Chapter6_Polymorphism;

public class Lesson7_TypeCasting {
    public static void main(String[] args) {


        int a = 3;//widening casting
        double b = a;//widening casting
        int c = (int)b;//narrowing casting



        Child1 child1 = new Child1();//up casting
        Parent1 parent1 = child1;//up casting

//        parent1.doIt();

        Child1 child11 = (Child1) parent1;//down casting



         child11.doOk();
         child11.doIt();


    }
}


class Parent1{
   void doIt(){

   }
}

class  Child1 extends Parent1{
    void doOk(){

    }
}
