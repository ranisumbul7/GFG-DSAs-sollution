class Solution {
    public static int largest(int[] arr) {
        // Initialize max_no with the first element of the array
        int max_no = arr[0];
        // Iterate through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is greater than max_no, update max_no
            if (arr[i] > max_no) {
                max_no = arr[i];
            }
        }
        return max_no;
    }
}
