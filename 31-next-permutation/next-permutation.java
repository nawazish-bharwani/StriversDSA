class Solution {
    public void nextPermutation(int[] nums) {
                int idx=-1;
        //finding the point where nums[i] < nums[i+1]
        //At this point we have a dip, which is a point where we can make a number greater than the current
        for (int i = nums.length-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]) {
                idx=i;
                break;
            }
        }
        //if idx is -1 means all the numbers are in decending order and hence is the greatest number possible
        //so we reverse the number to make it in ascending order and it will become smallest number
        if(idx==-1) {
            int p1=0;
            int p2=nums.length-1;
            while (p1<p2) {
                swap(nums,p1,p2);
                p1++;
                p2--;
            }
            return;
        }
            //if we have a dip then we swap the dip point with the next smallest number on the right side
            for (int i=nums.length-1;i>idx;i--) {
                if (nums[i]>nums[idx]) {
                    swap(nums,i,idx);
                    break;
                }
            }
            //as the numbers are in increasing order from right to left we can reverse them to get the
            //next greater number
                        int p1=idx+1;
            int p2=nums.length-1;
            while (p1<p2) {
                swap(nums,p1,p2);
                p1++;
                p2--;
        }
        }

    static void swap (int[] arr, int p1, int p2) {
        int temp=arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;
    }
    
}