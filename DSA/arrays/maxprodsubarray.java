package DSA.arrays;


class sol6 {
    int maxProduct(int[] arr) {
        // code here
       
       int maxprod =arr[0];
       int minprod =arr[0];
       int ans = arr[0];
       
       for(int i =1; i<arr.length;i++){
           
           if(arr[i]<0){
               
               int temp = maxprod;
               maxprod = minprod;
               minprod = temp;
               
               
           }
           
           maxprod = Math.max(arr[i], arr[i]*maxprod);
           minprod = Math.min(arr[i], arr[i]*minprod);
           ans = Math.max(ans,maxprod);
           
           
       }
       
       return ans;
       
    }
}

public class maxprodsubarray {

    public static void main(String [] args){

        int arr[] = {-2, 6, -3, -10, 0, 2};

        sol6 obj = new sol6();

        System.out.println(obj.maxProduct(arr));
    }
    
}

