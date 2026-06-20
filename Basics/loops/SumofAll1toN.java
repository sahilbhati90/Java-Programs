package Basics.loops;

import java.util.Scanner;

public class SumofAll1toN {
    static void main() {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n =sc.nextInt();
        for(int i =0;i<=n;i++){
            sum = sum+i;
            System.out.println(sum);
            System.out.println("Sum = "+i+"+"+sum);
        }
    }
}
