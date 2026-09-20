// we will start from the first element 
// and compare it with the next element 
// if the first element is greater than the next element then we will swap 
// them and move to the next element and repeat the process until we reach the end of the array.   
//  then we will repeat the process for n-1 times where n is the number of elements in the array.
    public class bubblesort {
    public static void bubbleSort(int arr []) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
      

    public static void main(String[] args) {
        int arr[] = {5, 65, 89, 57, 68, 56, 45, 78, 78};
        bubbleSort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
        }
    }
}
    

