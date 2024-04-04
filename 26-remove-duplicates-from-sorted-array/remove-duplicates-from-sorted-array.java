import java.util.HashSet;
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            hs.add(nums[i]);
        }
        int idx=0;
        int k=hs.size();
        for(int i=0;i<nums.length;i++) {
            if(hs.contains(nums[i])) {
                nums[idx]=nums[i];
                hs.remove(nums[idx]);
                idx++;
            }
        }
        return k;
    }
}