package Basics.Patterns;

public class pattern5 {
    static void main() {

        //Inverted triangle
        int n =5;

        for(int r =1;r<=n;r++){
            //for each row ->variable column
            for(int c =1;c<=n-r+1;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
