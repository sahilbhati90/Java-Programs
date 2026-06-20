package Basics.loops;
import java.util.Scanner;
public class MultipleofN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number =");
        int n = sc.nextInt();

        for(int i =1;i<=10;i++){
            System.out.println(n +"X"+ i +"="+i*n);
        }

    }


}
