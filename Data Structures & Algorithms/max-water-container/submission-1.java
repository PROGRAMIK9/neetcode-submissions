class Solution {
    public int maxArea(int[] heights) {
        int w = heights.length-1;
        int max_water = 0;
        int i=0;
        while(i<w){
            int l = Math.min(heights[i],heights[w]);
            int area = l*(w-i);
            max_water = Math.max(max_water,area);
            if(heights[i]>heights[w]){w--;}else i++;
        }
        return max_water;
    }
}
