class Solution {
    public String firstPalindrome(String[] words) {
        String ans="";
        for(int i=0;i<words.length;i++) {
            if(isPalindrome(words[i])) {
                ans=words[i];
                break;
            }
        }
        return ans;
    }
    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length()-1;
        while(start<end) {
            if(str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}