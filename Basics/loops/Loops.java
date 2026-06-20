package Basics.loops;

public class Loops {

    static void main(){

        //for Loop
        for(int i =1; i<5;i++){
            System.out.println(i);
        }
        System.out.println("Second Loop");

        for(int i=1;i<=10;i+=2){
            System.out.println(i);
        }

        System.out.println("The Pattern");
        for(int i =1; i<=4; i++){
            for(int j =1; j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Iteration");

        for (int i = 1; i <=4 ; i++) {
            for(int j =1; j<=4; j++){
                System.out.println("i="+i + "j="+j);
            }
            System.out.println();
        }

        System.out.println("Break Keyword");

        for (int i = 0; i <=10; i++) {
            if(i == 7){
                break;
            }
            System.out.println(i);

        }
        System.out.println("Continue Keyword");
        for (int i = 0; i <=10 ; i++) {
            if(i ==1 || i==2 || i ==4){
                continue;
            }
            System.out.println(i);

        }

        //While Loop
        System.out.println("While Loop");
        int i =0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
    
}
