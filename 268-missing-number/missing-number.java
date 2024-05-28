class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int gaussSum = (n*(n+1))/2;
        int arrSum=0;
        for(int i=0;i<n;i++) {
            arrSum+=nums[i];
        }
        return gaussSum-arrSum;
    }
}