class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Sorting method O(n*m log m) - n number of strings n length of each string. O(n*m);
        // HashMap<String, List<String>> map = new HashMap<>();
        // for(String s: strs){
        //     char[] charArray = s.toCharArray();
        //     Arrays.sort(charArray);
        //     String sorted = new String(charArray);
        //     map.putIfAbsent(sorted, new ArrayList<>());
        //     map.get(sorted).add(s);
        // }
        // return new ArrayList<>(map.values());
        //HashMap
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] count = new char[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
