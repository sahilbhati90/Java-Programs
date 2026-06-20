package Java8;

import java.util.function.Supplier;

public class supplier {
    static void main() {
        Supplier<String> greeting = () -> "Welcome to Java";

        System.out.println(greeting.get());
    }
}
