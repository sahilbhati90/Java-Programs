package DSA.arrays;

class sol1{

    static void reverse(int arr [], int i, int j){

       

        while(i<j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }


    }
}


public class ReverseArray {

    public static void main(String [] args){

    int arr[] = {8,7,6,5,4,3,2,1};

    sol1.reverse(arr,0,arr.length-1);

    for(int x:arr){

        System.out.println(x);

    }

    }
    
}
