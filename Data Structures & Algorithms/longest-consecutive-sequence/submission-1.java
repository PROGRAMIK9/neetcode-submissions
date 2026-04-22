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
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 0, curr = nums[0], streak = 0, i = 0;

        while (i < nums.length) {
            if (curr != nums[i]) {
                curr = nums[i];
                streak = 0;
            }
            while (i < nums.length && nums[i] == curr) {
                i++;
            }
            streak++;
            curr++;
            res = Math.max(res, streak);
        }
        return res;
    }
}
