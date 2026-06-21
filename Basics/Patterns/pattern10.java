package Basics.Patterns;

public class pattern10 {
    static void main() {
//        int n =5;
//
//        for (int r = 1; r <=n ; r++) {
//            //spaces - part1
//            for (int c = 1; c <= n-r ; c++) {
//                System.out.print("  ");
//            }
//            //part 2
//            if(r==1 || r==n){
//                for(int c =1; c<=2*r-1;c++){
//                    System.out.print("* ");
//                }
//            }
//            else{
//                //middle rows
//                //1*
//                System.out.print("* ");
//                //2r-3
//                for (int c = 1; c <=2*r-3 ; c++) {
//                    System.out.print("  ");
//                }
//                //1*
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

        int n =10;
        for (int r = 1; r <=n ; r++) {

            //Front Space
            for(int c = 1; c <=n-r ; c++) {
                System.out.print("  ");
            }

            //First and last row
            if(r==1 || r==n) {
                for (int c = 1; c<=2*r-1; c++) {
                    System.out.print("* ");
                }
            }
                else{

                    //middle rows


                System.out.print("* ");
                    for (int c =1; c <=2*r-n+1 ; c++) {
                        System.out.print("  ");
                    }
                System.out.print("  * ");

                }
            System.out.println();


        }
    }
}
