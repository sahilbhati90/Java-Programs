package Basics.Patterns;

public class pattern6 {
    static void main() {

        int n =5;

        for (int r = 1; r <=n ; r++) {{

            for (int c = 1; c<=n-r; c++) {
                System.out.print("  ");
                
            }
            for (int c = 1; c <=2*r-1; c++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
            
        }
    }
}
