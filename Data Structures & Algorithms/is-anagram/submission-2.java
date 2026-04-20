class Solution {
    public boolean isAnagram(String s, String t) {
        //Hash Tabl O(n+m) & O(1)
        if(s.length()!=t.length()) return false;
        char[] seq = new char[26];
        for(char cs: s.toCharArray()){
            seq[cs-'a']++;
        }
        for(char ts: t.toCharArray()){
            seq[ts-'a']--;
        }
        for(int i=0;i<26;i++){
            if(seq[i]!=0) return false;
        }
        return true;
    }
}
