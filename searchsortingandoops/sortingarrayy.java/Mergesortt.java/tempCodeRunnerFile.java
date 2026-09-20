 public void devide {

    void merge(int arr[], int left, int mid, int right) {
        int temp[] = new int[right -left + 1];
        int idx = left;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2  <= right) {
            if (arr[idx1] <= arr[idx2]) {
                temp[x++] = arr[idx1++];
            } else {
                temp[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            temp[x++] = arr[idx1++];
        }

        while (idx2 <= right) {
            temp[x++] = arr[idx2++];
        }

        for (int i = left; i <= right;i++) {
            arr[ i] = temp[x++];
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
        int arr[] = {5, 65, 89, 57, 5 ,6 , 88, 56, 45, 78, 90, 12, 34, 56, 78};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}