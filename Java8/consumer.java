package Java8;
import java.util.function.Consumer;
public class consumer {
    static void main() {
        Consumer<String> printMessage =
                message -> System.out.println("Message: " + message);
        printMessage.accept("Hello Java");

    }

}
