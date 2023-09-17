package Module3.Chapter15_CollectionFramework.Part1_List;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lesson9_ForEachMethod {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2,232,3421,34,6,8,22,92);

//        for (int i = 0; i < integers.size(); i++) {
//            System.out.println(integers.get(i));
//        }
//
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }

//        integers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });




//        integers.forEach(integer -> System.out.println(integer));

         integers.forEach(System.out::println);



    }
}
