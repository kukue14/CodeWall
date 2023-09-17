package Module3.Chapter15_CollectionFramework.Part2_Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Lesson9_Limit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,1,3,3,2,5,6,4,3,4);
        System.out.println(list.stream().limit(3).toList());

        System.out.println(list.stream().limit(5).distinct().toList());
        System.out.println(list.stream().distinct().limit(4).toList());


    }
}
