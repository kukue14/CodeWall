package Module3.Chapter15_CollectionFramework.Part1_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson5_RetainAll {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(2);
        integers.add(7);
        integers.add(4);
        integers.add(5);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(6);
        integers.add(1);
        integers.add(3);

        System.out.println(integers);

        List<Integer> delist = Arrays.asList(1,3,5,7);
        System.out.println("Retain list "+delist);

        integers.retainAll(delist);
        System.out.println(integers);
    }
}
