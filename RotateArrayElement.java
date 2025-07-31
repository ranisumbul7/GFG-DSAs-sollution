class Solution {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;

        int[] result = new int[n];

                                                               // Copy from d to end
        int k = 0;
        for (int i = d; i < n; i++) {
            result[k++] = arr[i];
        }

                                                             // Copy from 0 to d-1
        for (int i = 0; i < d; i++) {
            result[k++] = arr[i];
        }

                                                            // Copy back to original array
        for (int i = 0; i < n; i++) { 
            arr[i] = result[i];
        }
    }
}
