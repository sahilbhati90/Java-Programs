package Java8;
import java.util.function.Predicate;
public class predicate {
    static void main() {

        Predicate<Integer> isEven = n -> n%2 ==0;

        System.out.println(isEven.test(10));//true
        System.out.println(isEven.test(15));//false

    }
}
