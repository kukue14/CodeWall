package Module2.Chapter4_OOP;

public class Lesson10_Parameters {

    static void calculate(int a,int b){
        System.out.println(a+b);
    }

    static void fullName(String firstName,String middleName,String lastName){
        System.out.println((firstName+" "+middleName+" "+lastName).toUpperCase());
    }

    static double sum(double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {

       calculate(5,4);
       calculate(100,200);

        fullName("Aung","Phyo","Lwin");
        System.out.println(sum(5, 5.4, 3.2));
    }
}


//parameter
//arguments
// rT methodName (parameters){}