class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Brute force
        // Set<List<Integer>> res = new HashSet<>();
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         for (int k = j + 1; k < nums.length; k++) {
        //             if (nums[i] + nums[j] + nums[k] == 0) {
        //                 List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 res.add(tmp);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(res);
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j =i+1, k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
                    while(j<k && nums[j] == nums[j-1])j++;
                }else if(sum <0) j++;
                else k--;
            }
        }
        return res;
    }
}
