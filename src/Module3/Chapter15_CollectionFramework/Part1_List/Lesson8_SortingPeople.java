package Module3.Chapter15_CollectionFramework.Part1_List;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

class PersonLite {
    String name;
    int points;

    public PersonLite(String name, int points) {
        this.name = name;
        this.points = points;
    }
}

public class Lesson8_SortingPeople {
    public static void main(String[] args) {
        Person person12 = new Person("Thura Linn",23);
        Person person121 = new Person("Han Htut San",20);
        Person person122 = new Person("CodeWAll",19);
        Person person123 = new Person("Technologies",40);
        Person person124 = new Person("Tech",23);
        Person person125 = new Person("Academy",40);
        Person person1251 = new Person("American",40);
        Person person126 = new Person("Code.com",50);


        List<Person> person12List = Arrays.asList(person12,person121,person122,person123,
                person124,person125,person126,person1251);




//        Collections.sort(person12List, (o1, o2) -> {
//            if (o1.points>o2.points) { return -1;}
//            else if (o1.points==o2.points) {
//                return o1.name.compareTo(o2.name);
//            }
//
//            return 1;
//        });

        Collections.sort(person12List, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.points<o2.points) return 1;

                if(o1.points==o2.points) return o1.name.compareTo(o2.name);

                return -1;
            }
        });


        for (Person person : person12List) {
            System.out.println(person.points + " " + person.name);
        }

//        person12List.sort((o1, o2) -> {
//            if(o1.points>o2.points){
//                return -1;
//            } else if (o1.points==o2.points) {
//               return o1.name.compareTo(o2.name);
//            } else {
//                return 1;
//            }
//
//        });


//        person12List.forEach(person -> {
//            System.out.println(person.points+" "+person.name);
//        });


    }
}


