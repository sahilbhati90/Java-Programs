package Basics.Patterns;

public class pattern13 {
    static void main() {
        int n = 5;


        for(int row =1; row<=n;row++){

            //Part1
            for(int col =1; col<=row;col++){
                System.out.print("* ");
            }
            //Part2(Space)
            for (int c = 1; c <=2*(n-row) ; c++) {
                System.out.print("  ");
            }
            //Part3
            for (int c = 1; c <=row; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Inverted Symmetry
        for(int r =1;r<=n;r++){
            //for each row ->variable column
            //Part4
            for(int c =1;c<=n-r+1;c++){
                System.out.print("* ");
            }
            //Part5(Spaces)
            for (int c = 1; c <=2*(r-1) ; c++) {
                System.out.print("  ");
            }
            //Part6
        for (int c = 1; c <=n-r+1 ; c++) {
            System.out.print("* ");
        }


            System.out.println();
        }

    }
}
