
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1L,"Tuan",26));
        list.add(new Student(2L,"Tri",21));
        list.add(new Student(3L,"Manh",18));


        // tinh người trên 20 tuổi
        long ageCount = list.stream()
                .filter(student -> student.getAge() > 18)
                .count();
        System.out.println(ageCount);

        //for each
        list.stream().forEach(student -> System.out.println(student.getName()));


    }
}
