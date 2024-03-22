class Solution {
    public int countHillValley(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            int l=i-1;
            int r=i+1;
            while(l>=0 && nums[l]==nums[i]) l--;
            while(r<nums.length && nums[r]==nums[i]) r++;
            if(l<0 || r>=nums.length) continue;
            if(nums[i]==nums[i+1]) continue;
            if(nums[i]>nums[l] && nums[i]>nums[r]) c++;
            if(nums[i]<nums[l] && nums[i]<nums[r]) c++;
        }
        return c;
    }
}