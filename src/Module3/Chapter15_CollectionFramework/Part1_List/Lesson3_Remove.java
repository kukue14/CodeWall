package Module3.Chapter15_CollectionFramework.Part1_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson3_Remove {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(9);
        integerList.add(7);
        integerList.add(7);
        integerList.add(3);
        integerList.add(8);
        System.out.println(integerList);

        integerList.remove(3);
        System.out.println(integerList);


        List<String> stringList = new ArrayList<>();
        stringList.add("aung aung");
        stringList.add("Mg aung");
        stringList.add("kyaw aung");
        stringList.add("Ye aung");
        stringList.add("kyaw kyaw");
        stringList.add("zaw zaw");
        stringList.add("kyaw kyaw");



        System.out.println(stringList);
        stringList.remove(3);
        System.out.println(stringList);

        System.out.println(stringList.remove("aung aung"));
        System.out.println("Removed string list "+ stringList);

        List delList = Arrays.asList("kyaw kyaw","zaw zaw","Ye ye", "Ye aung");
        System.out.println("Remove List: "+ delList);

        stringList.removeAll(delList);
        System.out.println(stringList);

    }
}
