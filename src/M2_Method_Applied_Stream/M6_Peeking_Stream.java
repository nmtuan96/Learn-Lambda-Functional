package M2_Method_Applied_Stream;

import java.util.ArrayList;
import java.util.List;

public class M6_Peeking_Stream {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"Tuan",26));
        list.add(new Student(2L,"Tri",21));
        list.add(new Student(3L,"Manh",18));

        //peeking stream: dùng để debug. xem các giá trị
        list.stream()
                .filter(result -> result.getAge() > 18)
                .peek(m -> System.out.println("check map 1: " + m.getName()))
                .map(Student::getName)
                .peek(m -> System.out.println("check map 2: " + m))
                .forEach(System.out::println);
    }
}
