package Module2.Chapter9_misc;

public class Lesson4_ToStringsMethods {
    public static void main(String[] args) {
        C obj = new C();
        System.out.println(obj);
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
        System.out.println(obj.getClass().getSimpleName());

        System.out.println(obj.hashCode());
        System.out.println(Integer.toHexString(obj.hashCode()));
    }
}

class C {
    @Override
    public String toString() {
        return super.toString();
    }
}
