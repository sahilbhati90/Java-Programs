package DSA.arrays;

class solv7{
    public int max(int arr[]){
        int n = arr.length;
        int maxwater=0;

        int lp = 0;
        int rp = n-1;

        while(lp<rp){
            int h = Math.min(arr[lp], arr[rp]);
            int w = rp -lp;

            int currwater = h*w;

            maxwater = Math.max(maxwater, currwater);

            if(arr[lp]<arr[rp]){
                lp++;
            }else{
                rp--;
            }
        }

        return maxwater;

    }
}


public class containerwithmostwater {

    public static void main(String[] args){

    int arr []= {1,8,6,2,5,4,8,3,7};
    solv7 obj = new solv7();
    System.out.println(obj.max(arr));

    }

}
