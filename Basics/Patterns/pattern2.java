package Basics.Patterns;

public class pattern2 {
    static void main() {

        //rectangle
        int n =3;

        for(int row =1;row<=n;row++){

            for(int col =1;col<=5;col++){
                System.out.print("* ");
            }
            //Move to next line
            System.out.println();
        }
    }
}
