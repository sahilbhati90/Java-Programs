package DSA.arrays;

class sol3 {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int j =0;

        for(int i = 0; i<n;i++){

            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }


        }
      
        }
    
}


public class MoveZeroes {

    public static void main (String [] args){

    int nums [] = {0,4,6,2,0,3,5,0,3,0};

    sol3 obj = new sol3();

    obj.moveZeroes(nums);

    for(int x : nums){

        System.out.print(x +" ");
    }

    }
    
}
