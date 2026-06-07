class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> arr = new HashMap<>();

        for(int i = 0 ; i< nums.length ; i++){
            arr.put(nums[i] , arr.getOrDefault(nums[i] , 0 ) + 1);
        }

        List<int[]> ans = new ArrayList<>();
        for(Map.Entry<Integer , Integer> entry : arr.entrySet()){
            ans.add(new int[] {entry.getKey(), entry.getValue()});
        }
        ans.sort((a , b) -> b[1] - a[1]);

       int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = ans.get(i)[0];
        }
        return res ; 
    }
}
