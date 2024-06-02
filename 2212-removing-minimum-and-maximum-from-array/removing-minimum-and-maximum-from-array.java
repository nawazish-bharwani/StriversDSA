class Solution {
    public int minimumDeletions(int[] nums) {
       int n = nums.length;
        if(n == 1) {return 1;}
        int minIndex,maxIndex;
        minIndex= maxIndex=0;
        for(int i=0;i<n;i++) {
            if(nums[i] < nums[minIndex]) {
                minIndex=i;
            }
            if(nums[i] > nums[maxIndex]) {
                maxIndex=i;
            }
        }
        int bothFromLeft=Math.max(minIndex+1,maxIndex+1);
        int bothFromRight = Math.max((n-minIndex),(n-maxIndex));
        int oneFromEachSide = Math.min(minIndex + 1, n-minIndex) + Math.min(maxIndex+1,n-maxIndex);
        int ans = Math.min(bothFromLeft, bothFromRight);
        return Math.min(ans,oneFromEachSide);
    }
}