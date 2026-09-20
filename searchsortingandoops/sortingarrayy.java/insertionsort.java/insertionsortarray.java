// i will start from index 1 compare from index 0
//  index 1 element will be key 
// 
public class insertionsortarray {
    static void insertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i-1;
        while (j >= 0 && arr[j] > key) {
            arr[j+1] = arr [j];
            j--;
        }
        
        arr[j+1] = key;
    }
       
}
    public static void main(String[] args) {
        int arr[] = {5, 65, 89, 57, 5 ,6 , 88, 56, 45, 78, 90, 12, 34, 56, 78};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
