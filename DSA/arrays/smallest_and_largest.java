package DSA.arrays;

class solv11{

    public int[] smallestAndlargest(int[] arr){

    

    int n = arr.length;
    int s = arr[0];
    int l = arr[0];
    for(int i = 0; i<n; i++){

        if(arr[i]<s){
            s=arr[i];
        }
        if(arr[i]>l){
            l = arr[i];
        }

    
    }
    return new int [] {s,l};

    }

}


public class smallest_and_largest {

    public static void main(String[] args) {

        int [] arr = {34,55,67,34,85,25,78,36};

        solv11 obj = new solv11();


        int [] ans = obj.smallestAndlargest(arr);

        System.out.println("Smallest:" + ans[0]);
        System.out.println("Largest :" + ans[1] );

        

    }


    
}
