package Module1.Chapter3_Array.Random;

import java.util.Random;
import java.util.Scanner;

public class RandomEx {
    public static void main(String[] args) {
        Random random = new Random();
        int randNumber = random.nextInt(1,100);  //90
//        System.out.println(randNumber);


        Scanner sc = new Scanner(System.in);
        System.out.print("Guest a number : ");
        int inputNum = sc.nextInt();            //50

        while (true){
            if (randNumber == inputNum){
                System.out.println("Congratulation you guest it correctly.");
                break;
            }
            else if(inputNum > randNumber){
                System.out.println("Wrong number. Your number is grater than the random number");
                System.out.print("Guest another number : ");
                inputNum = sc.nextInt();
            }
            else {
                System.out.println("Wrong number. Your number is less than the random number");
                System.out.print("Guest another number : ");
                inputNum = sc.nextInt();
            }
        }
    }
}



/*
Complete the program to output  (count)
=> how many times you guested
=> and feedback on the amount of guested count
=> if user guest more than 10 or 15 times => generate new random number

 */





















