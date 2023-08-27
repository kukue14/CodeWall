package Module2.Chapter4_OOP;

public class Lesson15_InitializerBlog {
    Lesson15_InitializerBlog() {
        System.out.println("I'm constructor.");
    }

    // Instance Initializer Block
    {
        System.out.println("I'm instance initializer.");
    }

    //static initializer block
    static  {
        System.out.println("I'm working.");
    }

    public static void main(String[] args) {
        System.out.println("I'm in main method.");
        new Lesson15_InitializerBlog();
    }
}
