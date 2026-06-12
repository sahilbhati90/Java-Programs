package DSA.arrays;

class solution {
    public int linearsearch(int[] arr) {
        int n = arr.length;
        int k = 9;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.println("Target Found at index = " + i);
                return i;
            }
        }
        System.out.println("Target not found");
        return -1;
    }

    public void reverse(int[] arr, int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 6, 0, 4, 6, 4, 9, 3};
        solution obj2 = new solution();
        System.out.println(obj2.linearsearch(arr));
    }
}
