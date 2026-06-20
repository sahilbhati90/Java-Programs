package Basics.Patterns;

public class pattern3 {

    static void main() {
        int n = 5;

        //left angled triangle
        for(int row =1; row<=n;row++){
            for(int col =1; col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
