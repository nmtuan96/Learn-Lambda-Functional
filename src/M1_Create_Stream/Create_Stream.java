package M1_Create_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Create_Stream {
    public static void main(String[] args) {
        //C1 Tạo Stream từ mảng
        int[] numbers = {1,2,3,4};
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));

        //C2 Stream of
        Stream.of(1,2,3,4).forEach(n -> System.out.println(n));


        //C3 Stream generate
        Stream<Double> stream = Stream.generate(()-> Math.random());
        stream.limit(10)
                .forEach(n -> System.out.println(n));


        //C4 Stream iterate để tính toán vế lambda
        Stream.iterate(1, n -> n + 1 )
                .limit(10)
                .forEach(n -> System.out.println(n));

    }
}
