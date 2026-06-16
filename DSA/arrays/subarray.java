package DSA.arrays;

class solv4 {
    public int sub(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}

public class subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;
        solv4 obj = new solv4();

        System.out.println(obj.sub(arr, k));
    }
}
