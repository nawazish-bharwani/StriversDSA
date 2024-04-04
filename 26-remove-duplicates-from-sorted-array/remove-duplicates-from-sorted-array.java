import java.util.HashSet;
class Solution {
    public int removeDuplicates(int[] nums) {
        int start=0;
        int end=start+1;
        while(end<nums.length) {
            if(nums[start] == nums[end]) {
                end++;
            } else {
                start++;
                nums[start]=nums[end];
            }
        }
        return ++start;
    }
}