package Basics.loops;
import java.util.Scanner;
public class Count1toN {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number = ");
        int n = sc.nextInt();


        for(int i =1; i<=n;i++){
            System.out.println(i);
        }

        System.out.println("From n to 1");
        for(int i =n; i>=1;i--){
            System.out.println(i);
        }

    }
}
