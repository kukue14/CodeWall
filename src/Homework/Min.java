package Homework;

public class Min {
    public static void main(String[] args) {
        int mark1 = 100;
        int mark2 = 10;
        int mark3 = 50;
        System.out.print("The minimum number is : ");
        if(mark1 < mark2) {
            if(mark1 < mark3) System.out.println(mark1);
            else System.out.println(mark3);
        } else {
            if (mark2 < mark3) System.out.println(mark2);
            else System.out.println(mark3);
        }
    }
}
