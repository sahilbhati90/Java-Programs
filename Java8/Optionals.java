package Java8;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Optionals {
    static void main() {

        //of()
        Optional<String> name = Optional.of("John");
        System.out.println(name.get());

        //ofNullable()
        String n = null;
        Optional<String> optional =
                Optional.ofNullable(n);
        System.out.println(optional.isPresent());

        //empty()
        Optional<String> opt =
                Optional.empty();

        System.out.println(optional.isPresent());

        //isPresent()

        Optional<String> ns =
                Optional.of("John");

        if(ns.isPresent()){
            System.out.println(ns.get());
        }

        //orElse()

        Optional<String> np =
                Optional.empty();
        String r =
                name.orElse("Guest");
        System.out.println(r);

        //orElseGet()

        Optional<String> nsp =
                Optional.empty();

        String result =
                nsp.orElseGet(() -> "Generated User");

        System.out.println(result);

        //orElseThrow()

        Optional<String> nsps =
                Optional.empty();

        String value =
                nsps.orElseThrow(
                        () -> new RuntimeException(
                                "Name not found"
                        )
                );
    }
}
