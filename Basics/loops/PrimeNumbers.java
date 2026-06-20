package Basics.loops;

public class PrimeNumbers {
    static void main() {
        for(int i = 1;i<=100;i=i+2){
            if(i==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
