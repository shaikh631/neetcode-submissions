class Solution {
    public int search(int[] nums, int target) {
        int str = 0 , end = nums.length - 1 ;
        while(str <= end ){
            int mid = (str + end ) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) end--;
            else str++;
        }
        return -1 ;
    }
}
