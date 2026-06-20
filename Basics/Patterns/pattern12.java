package Basics.Patterns;

public class pattern12 {
    static void main() {
        //right angled triangle

        int n =4;

        for (int r = 1; r <=n ; r++) {

            //Space
            for (int c = 1; c <=n-r ; c++) {
                System.out.print("  ");

            }
            //Star
            for (int c = 1; c <=r ; c++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
