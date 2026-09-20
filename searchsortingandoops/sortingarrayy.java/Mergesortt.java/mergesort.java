// in this type of shorting we will divede it into 2 part and then further divede until a sinle elemts separed   like atree like structure 
// and start comparing the elements and then merge them in a sorted way 
// compare by side elements and then merge them in a sorted way
// and make a inverse tree like structure and then we will get the sorted array
//.

    public class mergesort {

     static void merge(int arr[], int left, int mid, int right) {
        int temp[] = new int[right -left + 1];
        int idx = left;
        int idx2 = mid + 1;
        int x = 0;

        while (idx <= mid && idx2  <= right) {
            if (arr[idx] <= arr[idx2]) {
                temp[x++] = arr[idx++];
            } else {
                temp[x++] = arr[idx2++];
            }
        }

        while (idx <= mid) {
            temp[x++] = arr[idx++];
        }

        while (idx2 <= right) {
            temp[x++] = arr[idx2++];
        }

        for (int i = left, j = 0; i <= right;i++, j++) {
            arr[ i] = temp[j];
        }
    }

    static void mergeSort(int arr[], int left, int right) {
        if (left >=right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    
      public static void main(String[] args) {
        int arr[] = {5, 65, 89, 57, 5 ,6 , 88, 56, 45, 90, 12, 34, 56,};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

