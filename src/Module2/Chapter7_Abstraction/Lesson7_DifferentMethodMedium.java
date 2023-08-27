package Module2.Chapter7_Abstraction;


interface  Calculator1 {
    void cal(int a, int b);
}

class Sum implements Calculator1 {
    @Override
    public void cal(int a, int b) {
        System.out.println(a + b);
    }
}

class Sub implements Calculator1 {
    @Override
    public void cal(int a, int b) {
        System.out.println(a - b);
    }
}

public class Lesson7_DifferentMethodMedium {
    void calculate(int a, int b, Calculator1 calculator1) {
        calculator1.cal(a, b);
    }

    public static void main(String[] args) {
        Lesson7_DifferentMethodMedium obj = new Lesson7_DifferentMethodMedium();
        obj.calculate(1, 2, new Calculator1() {
            @Override
            public void cal(int a, int b) {
                System.out.println(a*b);
            }
        });

        obj.calculate(3,4, new Sum());
        obj.calculate(8,4, new Sub());
    }
}
