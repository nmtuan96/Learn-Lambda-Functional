package M2_Method_Applied_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class M1_Stream_Map_FlatMap {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"Tuan",26));
        list.add(new Student(2L,"Tri",21));
        list.add(new Student(3L,"Manh",18));

        //Map case1 map name
        list.stream()
                .map(student -> student.getName())
                .forEach(name -> System.out.println(name));

        // Map case 2 map age
        list.stream()
                .map(student -> student.getAge())
                .forEach(age -> System.out.println(age));


        // test casee 3 flat Map Stream<List<x>> -> Stream<X>
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        Stream<List<Integer>> stream = Stream.of(list1, list2);

        stream.flatMap(list3 -> list3.stream())
                .forEach(n -> System.out.println(n));

    }
}
