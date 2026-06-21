package Basics.Patterns;

public class pattern12 {
    static void main() {
        //Hollow diamond
        int n =5;

        for (int r = 1; r <=n ; r++) {
            //spaces - part1
            for (int c = 1; c <= n-r ; c++) {
                System.out.print("  ");
            }
            //part 2
            if(r==1){
                for(int c =1; c<=2*r-1;c++){
                    System.out.print("* ");
                }
            }
            else{
                //middle rows
                //1*
                System.out.print("* ");
                //2r-3
                for (int c = 1; c <=2*r-3 ; c++) {
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }
            System.out.println();
        }
        //Invert Hollow

        for (int r = 1; r <=n-1 ; r++) {
            //part1
            for (int c = 1; c <=r ; c++) {
                System.out.print("  ");
            }
            //part2
            if(r==n-1){
                System.out.print("* ");
            }else{
                //1*
                System.out.print("* ");
                //2(n-r)-3 spaces
                for (int c = 1; c <=2*(n-r)-3 ; c++) {
                    System.out.print("  ");
                }
                //1*
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
