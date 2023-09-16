package Module3.Chapter15_CollectionFramework.Part1_List;

import java.util.ArrayList;
import java.util.List;

public class Lesson2_AddMethod {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("CodeWall");
        list.add(true);
        list.add('c');
        System.out.println(list);

        list.add(1,"Technologies");
        System.out.println(list);



        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(9);
        integerList.add(8);
        System.out.println("Integer List is "+ integerList);

        list.addAll(integerList);
        System.out.println("List is now "+ list);



        List<String> stringList = new ArrayList<>();
        stringList.add("aung aung");
        stringList.add("kyaw kyaw");
        stringList.add("zaw zaw");
        System.out.println(stringList);

        list.addAll(0,stringList);
        System.out.println(list);
        
    }
}