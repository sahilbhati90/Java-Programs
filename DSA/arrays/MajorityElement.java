package DSA.arrays;
class solv8{
    public int majority(int arr[]){
        int n = arr.length;
        int f = 0;
        int e = arr[0];
        for(int i =0;i<n;i++){
            if(f ==0){
                e = arr[i];
            }
            if(e ==arr[i]){
                f++;
            }else if( e != arr[i]){
                f--;
            }


        }

        return e;
    }
}
public class MajorityElement {

    public static void main(String args[]){


        int arr[] = {3,2,3};
        solv8 obj = new solv8();

        System.out.println(obj.majority(arr));
    }
    
}
