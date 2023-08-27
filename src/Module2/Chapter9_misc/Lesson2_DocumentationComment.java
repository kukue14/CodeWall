package Module2.Chapter9_misc;

import Module2.Chapter4_OOP.Lesson9_ReturnObject;

public class Lesson2_DocumentationComment {

    /**
     *This is name method
     * @param name
     * @return String
     * @type static
     * @see other
     * @since 20
     */
    public static String name(String name) {
        return name;
    }
    public static void main(String[] args) {
        String name = name("Ku Kue");
        System.out.println(name);
    }
}
