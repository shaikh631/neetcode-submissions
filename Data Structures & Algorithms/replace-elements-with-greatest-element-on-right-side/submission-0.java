class Solution {
    public int[] replaceElements(int[] nums) {
        int n = nums.length ;
        int[] ans = new int[n];
        ans[n - 1] = -1;

        for(int i = nums.length - 2; i >= 0 ; i--){
            if(ans[i+1] < nums[i+1]) ans[i] = nums[i+1];
            else ans[i] = ans[i+1];
        }
        return ans;
    }
}