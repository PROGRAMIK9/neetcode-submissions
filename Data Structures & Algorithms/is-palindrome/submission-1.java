class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i =0, j=n-1;
        s = s.toLowerCase();
        while(i<j){
            char sch = s.charAt(i);
            char bch = s.charAt(j);
            if(!Character.isLetterOrDigit(sch)){i++; continue;}
            if(!Character.isLetterOrDigit(bch)){j--; continue;}
            if(sch != bch) return false;
            i++;
            j--;
        }
        return true;
    }
}
