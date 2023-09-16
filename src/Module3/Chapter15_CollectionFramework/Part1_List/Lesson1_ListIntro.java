package Module3.Chapter15_CollectionFramework.Part1_List;

import java.util.*;

public class Lesson1_ListIntro {
    public static void main(String[] args) {
        //we can't add new data to this array
        int numbers[] = new int[6];
        numbers[0] = 1;

        //we can't add other data types
        int number2[] = {1, 2, 5, 7, 8, 9};
        number2[2] = 3;
//        number2[0]= "Thura Linn";

        //we can't get the data with simple form
        System.out.println(number2);


        Object objects[] = {"thura linn", 1, true, 'a'};





        List<Object> list = new ArrayList();
        list.add(1);
        list.add("Thura");
        list.add(2.0);
        System.out.println(list);

        Integer integer = (Integer) list.get(0);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        int result =   list1.get(2);


//
//        List<Integer> list2 = Arrays.asList(1,2,3,4);
//        list2.set(0,20);
//        System.out.println(list2);



    }

}


//Object တွေကို စုစည်းထားတဲ့ data များ

//Collections Framework


