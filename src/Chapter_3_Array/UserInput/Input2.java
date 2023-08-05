package Module1.UserInput;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Number is "+num);

        System.out.println("Enter your name: ");
        Scanner sc1=new Scanner(System.in);
        String name = sc1.nextLine();
        System.out.println("Your name is :"+ name);
    }
}
