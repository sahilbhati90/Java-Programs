package Basics.Patterns;

public class pattern9 {
    static void main() {
        int n =10;

        for (int r = 1; r <=n ; r++) {
            if(r==1 || r==2 || r==n){
                for(int c =1;c<=r;c++){
                    System.out.print("* ");
                }
            }
            else{
                //middle row
                //1*
                System.out.print("+ ");
                for (int c = 1; c <= r-2; c++) {
                    System.out.print("  ");
                }
                //1*
                System.out.print("- ");
            }

            System.out.println();

        }
    }
}
