class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int n = nums.length;
        // for(int i =0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]) return true;
        //     }
        // }
        // return false;
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])) return true;
            map.put(nums[i], 1);
        }
        return false;
    }
}