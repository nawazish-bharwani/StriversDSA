class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start < end) {
            if(nums[start] %2 == 0) {
                start++;
            } else if(nums[end] %2 != 0) {
                end--;
            } else {
                swap(nums, start, end);
                start++;
                end--;
            }
        }
        return nums;
    }
    static void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
}