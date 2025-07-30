class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                index=i;
                break;
            }
            else
            {
                index=-1;
            }
        }
        
        return index;
    }
}
