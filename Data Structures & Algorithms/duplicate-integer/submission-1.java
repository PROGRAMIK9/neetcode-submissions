class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Solution 1 O(n^2) & O(1)
        // int n = nums.length;
        // for(int i =0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]) return true;
        //     }
        // }
        // return false;
        //Solution 2 O(n) & O(n)
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], 1);
            else return true;
        }
        return false;
    }
}