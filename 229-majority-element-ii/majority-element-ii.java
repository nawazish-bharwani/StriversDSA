import java.util.HashMap;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(nums[i])) {
                hm.put(nums[i],hm.get(nums[i])+1);
            } else {
                hm.put(nums[i],1);
            }
        }
        for (Integer key : hm.keySet()) {
            if(hm.get(key) > n/3) {
                ans.add(key);
            }
        }
        return ans;
    }
}