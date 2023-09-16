package Module3.Chapter15_CollectionFramework.Part1_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lesson4_RemoveIf {
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



//        integers.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//
//                if (integer % 2 == 0) {
//                    return true;
//                }
//                return false;
//            }
//        });
//        System.out.println(integers);

//        integers.removeIf(integer -> {
//            if(integer%2==0) return  true;
//            return false;
//        });



//        integers.removeIf(integer -> true);
//        integers.removeIf(integer -> {return true;});


        integers.removeIf(integer -> integer%2==0);
        System.out.println(integers);

//        List<String> names = new ArrayList<>();
//        names.add("Mg Aung");
//        names.add("Ma Zin");
//        names.add("Mg Kyaw");
//        names.add("Mg Myo");
//        names.add("Ma Thest");
//        names.add("Ma Moe");
//        names.add("Mg Min");
//        names.add("Ma Ma");
//        names.add("U Myo Mg");
//        System.out.println(names);


//        names.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                if(s.startsWith("Mg")) return true;
//                return false;
//            }
//        });
//        System.out.println(names);


//        names.removeIf(s -> {
//            if(s.startsWith("Mg")) return true;
//            return false;
//        });
//        System.out.println(names);

//        names.removeIf(n -> n.startsWith("Ma"));
//
//        System.out.println(names);


    }
}


// NameList
// removeIf( delete ma list) ==> male list
// find female list using male list