package ExceptionHandling;
import java.util.Scanner;

public class AgeValidator {

    

    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {

            validateAge(age);
            System.out.println("Eligible for voting");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        sc.close();
    }

    public static void validateAge(int age) {

        if (age < 18) {
            //throw new Exception(
            //        "Age must be 18 or above");
        }

    }
}