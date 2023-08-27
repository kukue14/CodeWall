package Module2.Chapter7_Abstraction;


interface I1{
    void notOK();
}

interface I2 {
    void ok();
}

class Use implements I1, I2 {
    @Override
    public void notOK() {

    }

    @Override
    public void ok() {

    }
}
public class Lesson8_MultipleInheritance {
    public static void main(String[] args) {

    }
}