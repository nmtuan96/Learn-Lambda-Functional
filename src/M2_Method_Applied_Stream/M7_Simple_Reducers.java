package M2_Method_Applied_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class M7_Simple_Reducers {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"Tuan",26));
        list.add(new Student(2L,"Tri",21));
        list.add(new Student(3L,"Manh",18));

        // check age >30 . neu ko có giá trị nào anymatch false và nonmatch=true (nếu có 1 giá trị anyMatch=True và nonMatch=false)
        boolean resultAnyMatch = list.stream()
                .anyMatch(m-> m.getAge() >30);
        System.out.println(resultAnyMatch);

        boolean resultNonMatch = list.stream()
                .noneMatch(m -> m.getAge() > 30);
        System.out.println(resultNonMatch);

        // find first
        Student resultFindFirst = list.stream().findFirst().get();
        System.out.println(resultFindFirst.getName());

        //find max
        Student resultFindMax = list.stream()
                .max(Comparator.comparing(Student::getAge))
                .get();
        System.out.println(resultFindMax.getName());
    }
}
