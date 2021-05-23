package M2_Method_Applied_Stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class M9_Collectors {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"Tuan",26));
        list.add(new Student(2L,"Tri",21));
        list.add(new Student(3L,"Manh",18));

        // key
        //value
        Map<String, Integer> result = list.stream()
                .filter(m -> m.getAge()>18)
                .collect(Collectors.toMap(m -> m.getName(), m -> m.getAge()));
        System.out.println(result);

        // swap list -> list
        List<Student> result2 = list.stream()
                .filter(m -> m.getAge() >18)
                .collect(Collectors.toList());

        //swap list -> map
        Map<Long, Student> result3 = list.stream()
                .collect(Collectors.toMap(m-> m.getId(), m -> m));

        IntSummaryStatistics result4 = list.stream()
                .filter(m -> m.getAge() >18)
                .collect(Collectors.summarizingInt(m -> m.getAge()));
        System.out.println(result4);

    }
}
