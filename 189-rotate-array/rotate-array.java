class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        while(k>n-1) {
            k=k%n;
        }
        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);
    }
    static void reverseArray(int[] arr, int start, int end) {
        while(start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }
}