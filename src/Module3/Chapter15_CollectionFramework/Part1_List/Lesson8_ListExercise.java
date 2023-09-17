package Module3.Chapter15_CollectionFramework.Part1_List;

import java.util.*;
class Person {
    int points;
    String name;
    int point;
    Person(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String toString() {
        return point + " - " + name + "\n";
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
}
public class Lesson8_ListExercise {

    public static void main(String[] args) {
        Person person1 = new Person("Aye Aung ", 60);
        Person person2 = new Person("Ku Kue", 100);
        Person person3 = new Person("Mg Mg", 99);
        Person person4 = new Person("Kyaw Kyaw", 50);
        Person person5 = new Person("Mg Kyaw", 99);
        Person person6 = new Person("Kyaw Mya", 50);
        Person person7 = new Person("Ko Ko", 60);
        Person person8 = new Person("Hla Hla", 80);
        Person person9 = new Person("Ba Mg", 60);
        Person person10 = new Person("Aye Mg", 60);

        List<Person> listPerson = Arrays.asList(person1, person2, person3, person4, person5, person6, person7, person8, person9, person10);

            Collections.sort(listPerson, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    if (o1.getPoint() < o2.getPoint()) return 1;
                    else if (o1.getPoint() == o2.getPoint()) {
                        return o1.getName().compareTo(o2.getName());
                    }
                    return -1;
                }
            });
            for (Person aPerson : listPerson) {
                System.out.println(aPerson.getPoint() + "\t" + aPerson.getName());
            }
    }
}

