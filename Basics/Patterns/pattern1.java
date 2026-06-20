package Basics.Patterns;

public class pattern1 {

    static void main(){

        //square
        int n = 4 ;

        for(int row=1; row<=n;row++){
            for(int col =1; col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
