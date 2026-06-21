package Basics.Patterns;

public class pattern11 {
    static void main() {
        int n =10;
        //pyramid
        for (int r = 1; r <=n ; r++) {
            for (int c = 1; c<=n-r; c++) {
                System.out.print("  ");
            }
            for (int c = 1; c <=2*r-1; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Inverted Pyramid
        for (int r = 2; r <=n ; r++) {
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
