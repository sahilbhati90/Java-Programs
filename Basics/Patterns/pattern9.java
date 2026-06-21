package Basics.Patterns;

public class pattern9 {
    static void main() {

//        int n =10;
//
//        for (int r = 1; r <=n ; r++) {
//            if(r==1 || r==2 || r==n){
//                for(int c =1;c<=r;c++){
//                    System.out.print("* ");
//                }
//            }
//            else{
//                //middle row
//                //1*
//                System.out.print("+ ");
//                for (int c = 1; c <= r-2; c++) {
//                    System.out.print("  ");
//                }
//                //1*
//                System.out.print("- ");
//            }
//
//            System.out.println();
//
//        }

//        int n = 10;
//
//        for (int r = 1; r <=n ; r++) {
//
//            for (int c = 1; c <=r ; c++) {
//
//                if(r==1 || r==2 || r==10){
//                    System.out.print("* ");
//                }
//                else{
//                    //middle rows
//                    //star
//                    if(c==1 || c == r){
//                        System.out.print("*   ");
//                    }
//                    else{
//                        //space
//                        for (int d = 1; c <= r-2; c++) {
//                    System.out.print("  ");
//               }
//
//
//                    }
//                }
//            }
//            System.out.println();
//
//        }

        int n = 5;

        for (int r = 1; r <= n; r++) {

            for (int c = 1; c <= r; c++) {

                if (r == 1 || r == n) {
                    System.out.print("* ");
                }
                else {

                    if (c == 1 || c == r) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
