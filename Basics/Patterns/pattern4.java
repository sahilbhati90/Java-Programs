package Basics.Patterns;

public class pattern4 {
    static void main(){

        int n = 5;

        for(int r =1;r<=n;r++){
            //for each row -> spaces, stars

            //spaces
            for (int c = 1; c<=n-r; c++) {
                System.out.print(" ");
            }
            //stars
            for(int c =1;c<=n;c++){
                System.out.print("* ");
            }
            //move to next row
            System.out.println();
        }
    }
}
