class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Track whether an element at index i is already used in the current path
        boolean[] used = new boolean[nums.length];
        
        backtrack(nums, new ArrayList<>(), used, result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> currentPath, boolean[] used, List<List<Integer>> result) {
        // Base Case: If the current path matches the length of nums, we found a valid permutation
        if (currentPath.size() == nums.length) {
            result.add(new ArrayList<>(currentPath)); // Create a copy of the list
            return;
        }

        // Explore choices
        for (int i = 0; i < nums.length; i++) {
            // If the element is already used in this branch, skip it
            if (used[i]) {
                continue;
            }

            // Make decision
            currentPath.add(nums[i]);
            used[i] = true;

            // Recurse down the decision tree
            backtrack(nums, currentPath, used, result);

            // Undo decision (Backtrack)
            used[i] = false;
            currentPath.remove(currentPath.size() - 1);
        }
    }
}