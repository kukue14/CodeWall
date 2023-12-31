package Module3.Chapter15_CollectionFramework.Part2_Stream;

import java.util.Arrays;
import java.util.List;

public class Lesson7_Distinct {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,8,1,2,1,2,3,4,3,4,5,6,5);
        list.stream().distinct().forEach(System.out::print);

        System.out.println();
        
        List<Integer> distinctList = list.stream().distinct().toList();
        System.out.print(distinctList + "\t");
    }
}
