package Module3.Chapter15_CollectionFramework.Part1_List;

import java.util.*;

public class Lesson7_Sorting {
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
        System.out.println(integers);


//        Collections.sort(integers);
//        System.out.println(integers);
//
//        Collections.reverse(integers);
//        System.out.println(integers);


//        Collections.sort(integers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1<o2) return  1;
//                return -1;
//            }
//        });



//        Collections.sort(integers,
//                (front,back)->{if(front>back) return -1;
//                return 1;
//        });

//        Collections.sort(integers,(o1, o2) -> o1.compareTo(o2));
//        System.out.println(integers);

//        Collections.sort(integers,(o1, o2) -> o2.compareTo(o1));
//        System.out.println(integers);

//        Collections.sort(integers, Comparator.naturalOrder());
//        System.out.println(integers);
//        Collections.sort(integers,Comparator.reverseOrder());
//        System.out.println(integers);


//        Collections.sort(integers, Integer::compareTo);
//        System.out.println(integers);


//        integers.sort(Integer::compareTo);
//        integers.sort(Comparator.naturalOrder());


        integers.sort(Comparator.reverseOrder());


    }
}
