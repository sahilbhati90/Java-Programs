package Basics.Patterns;

public class pattern8 {

    static void main() {

//        int n =4;
//        for (int r = 1; r <= n ; r++) {
//
//            for(int c =1; c<=6; c++){
//                if(r==1 || r==n ){
//                    System.out.print("* ");
//                }
//                else{
//                    //middle row
//                    if(c==1){
//                        System.out.print("* ");
//                    }
//                    else if(c==6){
//                        System.out.print("* ");
//                    }
//                    else{
//                        //middle columns
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();



        //}

        int n = 4;

        for (int r = 1; r <=n ; r++) {

            for (int c = 1; c <=6 ; c++) {

                if(r==1 || r==4){
                    System.out.print("* ");
                }
                else{
                    //Middle rows
                    //Star
                    if(c==1 || c==6){
                        System.out.print("* ");
                    }
                    //Space
                    else{
                        //middle column
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();

        }
    }
}
