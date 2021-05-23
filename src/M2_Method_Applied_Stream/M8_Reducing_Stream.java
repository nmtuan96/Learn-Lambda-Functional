package M2_Method_Applied_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class M8_Reducing_Stream {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"Tuan",26));
        list.add(new Student(2L,"Tri",21));
        list.add(new Student(3L,"Manh",18));

        //26 21 18
        // 47 18
        //65
        Optional<Integer> sum = list.stream()
                .map(Student::getAge)
                .reduce((a , b) -> a + b);
        System.out.println(sum);

        Integer sum1= list.stream()
                .map(Student::getAge)
                .peek(m -> System.out.println(m))
                .reduce(1,Integer::sum);
        System.out.println(sum1);
    }
}
