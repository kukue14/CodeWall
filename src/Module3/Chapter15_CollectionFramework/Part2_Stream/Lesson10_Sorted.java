package Module3.Chapter15_CollectionFramework.Part2_Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lesson10_Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 20, 11, 2, 300, 44, 3, 540, 75, 660, 5, 6, 700, 37, 28);
        System.out.println(list.
                stream()
                .filter(integer -> integer < 300)

                .sorted(Comparator.reverseOrder())
//                .sorted()
                .toList());
    }
}
