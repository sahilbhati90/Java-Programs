package ExceptionHandling;
public class trycatch {
    static void main(){
       

    
        //try-catch
        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        }

        System.out.println("Program continues...");

        //Nested try-catch

        try{
            //Outer try block
            int arr[] ={10,20,30};
            try{
                //Inner try block
                int result = arr[5];//ArrayIndexoutofboundException
                System.out.println(result);
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index is out of range.");
            }

         int num = 10 / 0; // ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Cannot divide by zero.");
        }

        System.out.println("Program continues...");

        //Multiple Catch Block
        try {

    String s = null;
    System.out.println(s.length());

} catch (NullPointerException e) {

    System.out.println("Null value found");

} catch (Exception e) {

    System.out.println("Generic exception");

}

    }    
  }
 
   



