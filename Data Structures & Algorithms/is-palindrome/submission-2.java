class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i =0, j=n-1;
        s = s.toLowerCase();
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){i++;}
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){System.out.println("Hi");j--;}
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
