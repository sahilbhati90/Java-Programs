package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    static void main() {
        List<Integer> numbers =
                Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<String> names = Arrays.asList("Rahul","Amit", "Priya", "Ankit", "Rohit");

        //filter
        numbers.stream()
                .filter(n ->n%2==0)
                .forEach(System.out::println);

        //map

        numbers.stream()
               // .map(String::toUpperCase)
                .forEach(System.out::println);

        //collect
        Arrays.asList(1,2,3,4,5,6,7,8)
                .stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        //System.out.println(evenNumbers);

        //sorted

        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        //distinct

        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        //count

        long count =
                Arrays.asList(1,2,3,4,5,6)
                        .stream()
                        .filter(n -> n % 2 == 0)
                        .count();

        System.out.println(count);

        //findFirst

        Optional<Integer> result =
                Arrays.asList(3,5,8,10)
                        .stream()
                        .filter(n -> n % 2 == 0)
                        .findFirst();

        System.out.println(result.get());

        //any match

        boolean result1 =
                Arrays.asList(1,2,3,4,5)
                        .stream()
                        .anyMatch(n -> n > 4);

        System.out.println(result);

    }
}
