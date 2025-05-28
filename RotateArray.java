class Solution {
    
    static void rvereseArray(int arr[], int start, int end) {
        int temp;

        while (start < end) {
            
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }

   
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d %= n;
        
        rvereseArray(arr, 0, d - 1);
        // Then reversing the last n-d elements.
        rvereseArray(arr, d, n - 1);
        // Finally, reversing the whole array.
        rvereseArray(arr, 0, n - 1);
    }
}
