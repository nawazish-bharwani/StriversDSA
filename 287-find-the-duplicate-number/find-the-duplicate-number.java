class Solution {
    public int findDuplicate(int[] nums) {
         int ans=0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(hs.contains(nums[i]))
            {
                ans=nums[i];
                break;
            } 
            else
            {
                hs.add(nums[i]);
            }
        }
        return ans;
    }
}