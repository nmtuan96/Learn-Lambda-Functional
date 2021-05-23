package M2_Method_Applied_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class M4_Sorting_Stream {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"Tuan",26));
        list.add(new Student(2L,"Tri",21));
        list.add(new Student(3L,"Manh",18));

        //sort id
        list.stream()
                .sorted(Comparator.comparing(Student::getId))
                .forEach(student -> System.out.println(student.getId()));
        //sort name
        list.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(student -> System.out.println(student.getName()));

        //sort age
        list.stream()
                .sorted(Comparator.comparing(Student::getAge))
                .forEach(student -> System.out.println(student.getAge()));
    }
}
