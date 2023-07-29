package Chapter_3_Array.Lesson_1_NormalArray;

import Formats.FormatLite;

import java.util.Arrays;

public class Array_code {
    public static void main(String[] args) {
        String names[] = {"Ku Kue", "Mya Mya", "Mg Mg", "Ko Ko", "Ki Ki"};
        int nums[] = {1, 2, 3, 10, 30};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        FormatLite.Underline('=', 50);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
//        System.out.println(nums[5]);
        FormatLite.Underline('=', 50);
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(nums));

        FormatLite.Underline('=', 50);

        int num1[] = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < num1.length; i++){
            num1[i] = num1[i] * 2;
            System.out.print(num1[i] + "\t");
        }
        System.out.println();
        FormatLite.Underline('=', 50);

        for(int i=num1.length-1; i>=0; i--)
            System.out.print(num1[i] + "\t");
    }
}
