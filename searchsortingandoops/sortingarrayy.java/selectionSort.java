// find the smallest element in array and put in starting 
// then find the second smallest element and put in second position and so on 
// we will repeat this process until the array is sorted 
// .............


 public class selectionSort {
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length;  i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                   
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 65, 89, 57, 5 ,6 , 88, 56, 45, 78, 90, 12, 34, 56, 78};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}