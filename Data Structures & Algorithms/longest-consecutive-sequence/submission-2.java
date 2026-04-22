class Solution {
    public int longestConsecutive(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int num:nums){
        //     set.add(num);
        // }
        // int res=0;
        // for(int num:nums){
        //     int streak =0, curr = num;
        //     while(set.contains(curr)){
        //         streak++;
        //         curr++;
        //     }
        //     res = Math.max(res,streak);
        // }
        // return res;
        // if (nums.length == 0) {
        //     return 0;
        // }
        // Arrays.sort(nums);
        // int res = 0, curr = nums[0], streak = 0, i = 0;

        // while (i < nums.length) {
        //     if (curr != nums[i]) {
        //         curr = nums[i];
        //         streak = 0;
        //     }
        //     while (i < nums.length && nums[i] == curr) {
        //         i++;
        //     }
        //     streak++;
        //     curr++;
        //     res = Math.max(res, streak);
        // }
        // return res;
        // HashSet<Integer> set = new HashSet<>();
        // for(int num:nums){
        //     set.add(num);
        // }
        // int res=0;
        // for(int num:nums){
        //     int streak =0, curr = num;
        //     while(set.contains(curr)){
        //         streak++;
        //         curr++;
        //     }
        //     res = Math.max(res,streak);
        // }
        // return res;
       
       Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;

        for (int num : nums) {
            if (!mp.containsKey(num)) {
                mp.put(num, mp.getOrDefault(num - 1, 0) + mp.getOrDefault(num + 1, 0) + 1);
                mp.put(num - mp.getOrDefault(num - 1, 0), mp.get(num));
                mp.put(num + mp.getOrDefault(num + 1, 0), mp.get(num));
                res = Math.max(res, mp.get(num));
            }
        }
        return res;
    }
}
