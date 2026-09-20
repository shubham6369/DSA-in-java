// Data should be sorted in increasing or decreasing order 
// algo for binary search
// we use 3 pointer left and right and middle 
// first we will find the middle element and compare it with the key
// if the middle element is equal to the key then we return the index of the middle element
// if the middle element is less than the key then we will search in the right half of the array
// if the middle element is greater than the key then we will search in the left half of the array
// we will repeat this process until we find the key or the left pointer is greater than the right pointer
// if the  left pointer is greater than the right pointer then we will return -1
// if there is very large no of array like 1000000 then we can use tertiary search which is more efficient than binary search by adding one more mid 
// [15,19,20,26,32,37]
 class ArrayExample {
         static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left+right) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }
}
    int[] arr = {15,19,20,26,32,37};     // by self
    int key = 26;
    int result = ArrayExample.binarySearch(arr, key);
if (result == -1) {
    System.out.println("Element not found in the array");
} else {
    System.out.println("Element found at index: " + result);
}

