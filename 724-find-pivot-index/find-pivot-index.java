class Solution {
    public int pivotIndex(int[] nums) {
          int[] PF = new int[nums.length];
        PF[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            PF[i] = PF[i-1] + nums[i];
        }
        //calculating leftSum and rightSum for each index
        for(int i=0;i<nums.length;i++) {
            int leftSum = PF[i];
            int rightSum=0;
            if(i == 0 ) {
                rightSum = PF[nums.length-1];
            } else {
                rightSum = PF[nums.length-1] - PF[i-1];
            }
            if(leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}