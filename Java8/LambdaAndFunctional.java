package Java8;

public class LambdaAndFunctional {
    static void main() {
        @FunctionalInterface
                interface Greeting{
            void sayHello();
        }
        Greeting g = () -> System.out.println("Hello");
    }
}
