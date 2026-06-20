package ExceptionHandling;
public class Finally {
    static void main(){
        try {

    System.out.println("Database Connected");

} catch (Exception e) {

    System.out.println("Error");

} finally {

    System.out.println("Database Connection Closed");

}

    }
    
}
