class Solution {
    public int majorityElement(int[] nums) {
        int currMajority=nums[0];
        int count=1;
        for (int i=1;i<nums.length;i++) {
            if (count == 0) {
                currMajority = nums[i];
                count = 1;
            } else {
                if (nums[i] == currMajority) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return currMajority;
    }
}