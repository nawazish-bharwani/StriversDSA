class Solution {
    public int pivotIndex(int[] nums) {
    int n= nums.length;
    int totalSum = 0;
    for (int i = 0; i < n; i++) {
      totalSum += nums[i];
    }
    int leftSum = 0, rightSum = totalSum;
    for (int i = 0; i < n; i++) {
      rightSum -= nums[i];
      if (leftSum == rightSum) {
        return i;
      }
      leftSum += nums[i];
    }
    return -1;
    }
}