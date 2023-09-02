package Module2.Chapter10_Strings;

public class Lesson2_StringConcatenation {
    public static void main(String[] args) {
        String name = "Ku Kue";
        String result = 1 + 2 + "Ku Kue" + 4 + 5;
        System.out.println(result);

        String n1 = "Ku Kue";
        String result1 = n1.concat(" is Excellent.");
        System.out.println(result1);

        StringBuffer n2 = new StringBuffer(n1);
        n2.append(" is so cool.");
        n2.append(" is so cool.");
        n2.append(" is so cool.");
        n2.append(" is so cool.");
        System.out.println(n2);

    }
}
