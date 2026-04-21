class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Sorting based O(n logn) & O(n)
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // List<int[]> arr = new ArrayList<>();
        // for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        //     arr.add(new int[]{entry.getValue(), entry.getKey()});
        // }
        // arr.sort((a,b)->b[0]-a[0]);
        // int[] res = new int[k];
        // for(int i=0;i<k;i++){
        //     res[i]=arr.get(i)[1];
        // }
        // return res;
        //MinHeap O(n logk) & O(n+k)
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // PriorityQueue<int[]> arr = new PriorityQueue<>((a,b)->a[0]-b[0]);
        // for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        //     arr.offer(new int[]{entry.getValue(), entry.getKey()});
        //     if(arr.size()>k){
        //         arr.poll();
        //     }
        // }
        // int[] res = new int[k];
        // for(int i=0;i<k;i++){
        //     res[i]=arr.poll()[1];
        // }
        // return res;
        //Bucket Sort O(n) & O(n)
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];

        for(int i=0;i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for(int i=freq.length-1;i>0 && index < k; i--){
            for(int n:freq[i]){
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
