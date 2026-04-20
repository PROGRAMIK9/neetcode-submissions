class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brute force O(n^2) & O(1)
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};
        //HashMap
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])) return new int[]{map.get(nums[i]),i};
            map.put(target-nums[i],i);
        }
        return new int[]{};
    }
}
