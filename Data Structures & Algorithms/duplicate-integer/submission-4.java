class Solution {
    public boolean hasDuplicate(int[] nums) {
        // sort the array
        Arrays.sort(nums);

        // loop and check next element is same with first for not
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1]) return true ;
        }
        // return false 
        return false ;
    }
}