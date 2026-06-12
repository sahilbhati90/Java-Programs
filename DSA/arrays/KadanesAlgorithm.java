package DSA.arrays;

class sol5{

    public int maxsubarray(int arr[]){

        //int n = arr.length;

        
        int ms = Integer.MIN_VALUE;;


        for(int i = 0; i<arr.length;i++){

            int cs = 0;

            for(int j = i; j<arr.length; j++){

                cs = cs+arr[j];
                ms = Math.max(cs,ms);
            }
        }

        return ms;

    }

    public int kadanealgorithm(int arr[]){

        int n = arr.length;
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<n; i++){

            cs = cs +arr[i];
            ms = Math.max(cs, ms);

            if(cs<0){
                cs =0;
            }

            
        }
        return ms;

        
    }
}


public class KadanesAlgorithm {

    public static void main(String[] args){

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        sol5 obj = new sol5();

        System.out.println(obj.maxsubarray(arr));
        System.out.println(obj.kadanealgorithm(arr));

    }
    
}
