package M2_Method_Applied_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class M5_Getting_Unique_Element {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"Tuan",26));
        list.add(new Student(2L,"Tri",21));
        list.add(new Student(3L,"Manh",18));

        //lấy những giá trị khác nhau ( TUẤN Trí Mạnh)
        list.stream()
                .map(Student::getName)
                .distinct()
                .forEach(System.out::println);

    }
}
