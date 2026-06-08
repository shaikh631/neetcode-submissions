class Solution {
    public int maxArea(int[] height) {
         int i = 0 ;
        int j = height.length - 1 ;
        int maxi = 0;
        while(i < j){
            int len = Math.min(height[i] , height[j]);
            int ans = len * Math.abs(j-i);
            maxi = Math.max(ans , maxi);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return maxi;
    }
}
