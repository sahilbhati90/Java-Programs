package Basics.Patterns;

public class pattern7 {
    static void main(){

        int n = 4;

        for (int r = 1; r <=n ; r++) {
            //space
            for (int c = 1; c <=r-1 ; c++) {
                System.out.print("  ");
            }
            //stars
            for (int c = 1; c <=2*n-2*r+1 ; c++) {
                System.out.print("* ");
            }
            //move to next row
            System.out.println();

        }
    }
}
