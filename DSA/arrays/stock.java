package DSA.arrays;

class solv9 {
    public int maxProfit(int[] prices) {

        int bb = prices[0];
        int mp = 0;

        for(int i =1; i<prices.length; i++){
            if(prices[i]>bb){
                mp= Math.max(mp, prices[i]-bb);
            }

            bb = Math.min(bb, prices[i]);
        }
        return mp;
    }
}
public class stock {
    public static void main(String args[]){
        int arr[] ={7, 10, 1, 3, 6, 9, 2};
        solv9 obj = new solv9();

        System.out.println(obj.maxProfit(arr));
    }
    
}
