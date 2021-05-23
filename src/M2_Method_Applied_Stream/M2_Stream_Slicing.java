package M2_Method_Applied_Stream;

import java.util.ArrayList;
import java.util.List;

public class M2_Stream_Slicing {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"Tuan",26));
        list.add(new Student(2L,"Tri",21));
        list.add(new Student(3L,"Manh",18));

        list.stream()
                .skip(2)
                .limit(1)
                .forEach(n -> System.out.println(n.getName()));
//        list.stream()
//                .takeWhile(m -> m.getAge() < 21)
//                .forEach(n -> System.out.println(n.getName()));
    }
}
