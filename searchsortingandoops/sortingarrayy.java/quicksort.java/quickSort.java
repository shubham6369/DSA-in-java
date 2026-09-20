    static int partition (int arr[], int start, int end) {
        int pivot = arr[end];
            int i = start - 1;
        
        for (int j = start; j < end; j++) {
            if ( arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr [end];
                arr[end] = temp;

                    return i;

                }
            }

    static void quickSort,( int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int pi = partition(arr, start, end);
        quickSort(arr, start, pi - 1);
        quickSort(arr, pi + 1, end);
    }
}