package DSA.arrays;

class sol2{

    public void rotate(int[] arr, int k){



        int n = arr.length;

        swap(arr, 0,k-1);
        swap(arr,k, n-1);
        swap(arr, 0, n-1);


    }



    public void swap( int [] arr, int i, int j){

        while(i<j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

    }


}

public class RotataArray {

    public static void main(String[] args){


    int arr[] = {1,2,3,4,5,6,7};
    sol2 obj = new sol2();
    obj.rotate(arr, 4);

    for(int x : arr){
        System.out.print(x+ " ");
    }


    }
   
    
    
}
