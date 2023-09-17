package Module3.Chapter15_CollectionFramework.Part2_Stream;

import java.util.Arrays;
import java.util.List;

public class Lesson8_Count {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,4,3,2,5,6,7,4,8,9,0,7,6);

        System.out.println(list.stream().filter(integer -> integer % 2 == 0).count());
    }
}
