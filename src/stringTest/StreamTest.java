package stringTest;


import javax.swing.text.html.Option;
import java.sql.SQLOutput;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName:
 * @Description:
 * @Date: 2020-04-03 15:45
 * @Author: ZhangLei
 * version: 1.0
 **/
@SuppressWarnings("all")
public class StreamTest {

    public static void main(String[] args) {
        /**
         *测试Stream的中间操作符
         */
//        Stream.of("aaa", "b", "cc").map(e -> e.length()).forEach(e -> System.out.println(e));
//        Stream.of("aaa", "b", "cc").map(String :: length).forEach(e -> System.out.println(e));
//        Stream.of("aaa", "b", "cc").mapToDouble(e -> e.length()).forEach(e -> System.out.println(e));
//        Stream.of("a-b-c-d", "e-f-g-h-i").flatMap(e -> Stream.of(e.split("-"))).forEach(e -> System.out.println(e));
//        Stream.of(1, 2,3, 4, 5).limit(3).forEach(e -> System.out.println(e));
//        Stream.of(1, 1 ,2 ,3, 4, 4, 4, 5).distinct().forEach(e -> System.out.println(e));
//        Stream.of(1, 2, 3, 4, 5).filter(e -> e >= 3).forEach(e -> System.out.println(e));
//        Stream.of(1, 2, 3, 4, 5).skip(1).forEach(e -> System.out.println(e));
//        Stream.of(2, 5, 4, 1, 3).sorted().forEach(e -> System.out.println(e));

        /**
         *  测试Stream的终止操作符
         */
//        Stream.of("a", "b", "a", "c").collect(Collectors.toSet()).forEach(e -> System.out.println(e));
//        System.out.println(Stream.of("a", "b", "c").count());
//        Optional<String> stringOptional = Stream.of("a", "b", "c").findFirst();
//        stringOptional.ifPresent(e -> System.out.println(e));
//        Optional<String> stringOptional = Stream.of("a", "b", "c", "d", "e").parallel().findAny();
//        stringOptional.ifPresent(e -> System.out.println(e));
//        boolean result = Stream.of("a", "b", "c").noneMatch(e -> e.equals("d"));
//        System.out.println(result);
//        boolean result = Stream.of("a", "b", "c").anyMatch(e -> e.equals("d"));
//        System.out.println(result);
//        boolean result = Stream.of("a", "a", "a").allMatch(e -> e.equals("a"));
//        System.out.println(result);
//        Optional<Integer> min = Stream.of(0, 5, 7, 1, 9).min((e1, e2) -> e1.compareTo(e2));
//        min.ifPresent(e -> System.out.println(e));
//        Optional<Integer> max = Stream.of(0, 4, 3, 6, 9 , 10).max((e1, e2) -> e1.compareTo(e2));
//        max.ifPresent(e -> System.out.println(e));
//        Optional<Integer> sum = Stream.of(2, 4, 6, 8).reduce((e1, e2) -> e1 + e2);
//        sum.ifPresent(e -> System.out.println(e));
        Object[] objects = Stream.of(1, 2, 3, 4, 5).toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }

}
