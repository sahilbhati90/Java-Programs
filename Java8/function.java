package Java8;
import java.util.function.Function;
public class function {
    static void main() {
        Function<String, Integer> getLength = text -> text.length();

        Integer length = getLength.apply("Chatgpt");

        System.out.println(length);
    }
}
