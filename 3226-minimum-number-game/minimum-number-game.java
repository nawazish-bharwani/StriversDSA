class Solution {
    public int[] numberGame(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=2) {
            ans[i]=nums[i-1];
            ans[i-1]=nums[i];
        }
        return ans;
    }
}