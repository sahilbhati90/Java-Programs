package DSA.arrays;

class sol4 {
    public int singlenumber(int[] nums) {
        int ans = 0;

        for (int x : nums) {
            ans = ans ^ x;
        }

        return ans;
    }
}
public class SingleNumber {

    public static void main(String[] args){

        int nums [] = {1,2,1,2,1,2,1,2,3};
        sol4 obj = new sol4();

        obj.singlenumber(nums);
        // for(int x:nums){

        
        // System.out.print(x);

        // }

    }
    
}
