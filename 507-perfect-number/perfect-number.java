class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i*i<num;i++) {
            if(num%i == 0) {
                if(i == num/i) {
                    sum+=i;
                } else {
                    sum+=i;
                    sum+=num/i;
                }
            }
        }
        sum=sum-num;
        if(num == sum) {
            return true;
        } else {
            return false;
        }
    }
}