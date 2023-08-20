package Module2.Chapter6_Polymorphism;

import java.util.Scanner;

public class Lesson3_MethodOverloadingExe {

    static void transfer(String ph,int amt){
        System.out.println("You have transferred "+amt+" MMK to "+ph);
    }

    static void transfer(String ph,int amt,String notes){
        System.out.println("You have transferred "+amt + " MMK to "+ph);
        System.out.println(notes);
    }
    public static void main(String[] args) {
        Scanner firstScan = new Scanner(System.in);

        System.out.print("Enter phone number to transfer: ");
        String phoneNumber = firstScan.nextLine();

        System.out.print("Enter amount: ");
        int amount = firstScan.nextInt();

        Scanner secondScan = new Scanner(System.in);

        System.out.print("Enter your notes: ");
        String notes = secondScan.nextLine();


        if (notes!=null){
            transfer(phoneNumber,amount,notes);
        }else {
            transfer(phoneNumber,amount);
        }
    }
}
