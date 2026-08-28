class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // Find the maximum pile size
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            long hours = 0;

            // Calculate total hours needed with speed = mid
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;   // ceil(pile / mid)
            }

            if (hours <= h) {
                // mid works, try a smaller speed
                right = mid;
            } else {
                // mid is too slow
                left = mid + 1;
            }
        }

        return left;
    }
}