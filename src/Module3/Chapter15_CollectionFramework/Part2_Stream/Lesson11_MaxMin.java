package Module3.Chapter15_CollectionFramework.Part2_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lesson11_MaxMin {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,4,4,6,3,6,7,8,5,4,3);

//        Maximum
        System.out.println(integerList.stream().max(Comparator.naturalOrder()).get());

//        Minimum
        System.out.println(integerList.stream().min(Comparator.naturalOrder()).get());
    }
}
