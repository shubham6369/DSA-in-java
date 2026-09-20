// we have taken 2 index left and right  and at every step we swap the left right value and then we move the left index to right and right index to left until the left index is less than the right index
// and move toward the middle from both sides


public class Main {
    public static void main 
}
    static void Reverse (int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
     }  
        

     static void rotate (int[] nums, int k) {
        int n = nums.length - 1;
            reverse(nums, left:0, n);
            reverse(nums, left:0, k - 1);
            reverse(nums, k, n);
     }


     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(arr));
     }









