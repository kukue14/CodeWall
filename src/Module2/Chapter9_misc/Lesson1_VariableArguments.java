package Module2.Chapter9_misc;

public class Lesson1_VariableArguments {
    static void name(String name) {
        System.out.println(name);
    }

    static void name(String first_name, String last_name) {
        System.out.println(first_name + last_name);
    }

    static void name(String sir_name, String first_name, String last_name) {
        System.out.println(sir_name + first_name + last_name);
    }

    static void fullName(String... names){
        String fullName = "";
        for (String aName : names) {
            fullName += aName;
        }
        System.out.println(fullName);
    }

    static void fullNum(int... integers) {
        int fullNum = 0;
        for (int aNum : integers) {
            fullNum += aNum;
        }
        System.out.println(fullNum);
    }
    
    static void fullChar(char... chars) {
        char fullChar = 0;
        for (char aChar : chars) {
            fullChar += aChar;
        }
        System.out.println(fullChar);
    }

    public static void main(String[] args) {
        fullName("Ku", " Kue", " Thu", " Htet", " Naing");
        fullNum(10,20,30,20);
        fullChar('a','w','d','f','g');
    }
}

