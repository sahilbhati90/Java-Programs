package ExceptionHandling;
public class Throw {
    static void main(){
        int age = 15;

if(age < 18){
    throw new RuntimeException("Age must be 18+");
}
        
    }
    
}
