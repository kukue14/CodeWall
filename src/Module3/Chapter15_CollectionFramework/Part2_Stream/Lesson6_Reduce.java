package Module3.Chapter15_CollectionFramework.Part2_Stream;

import java.util.Arrays;
import java.util.List;

public class Lesson6_Reduce {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e");

        String str = stringList.stream().reduce("Hello World", (s, s2) -> s + s2);
        System.out.println(str);

        String strLite = stringList.stream().reduce((s, s2) -> s + s2).get();
        System.out.println(strLite);
    }
}
