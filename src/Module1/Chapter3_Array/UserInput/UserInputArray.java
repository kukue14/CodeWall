package Module1.UserInput;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size= sc.nextInt();
        int array[]=new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number: ");
            array[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(array));
    }
}
