
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;

        // Pair up position and speed, then sort by starting position descending
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double) (target - position[i]) / speed[i]; // Time to reach target
        }

        // Sort by starting position in descending order (closest to target first)
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        int fleets = 0;
        double maxTime = 0.0;

        // Traverse cars from closest to target to farthest
        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            // If this car takes strictly more time than the fleet ahead of it,
            // it forms a new fleet.
            if (time > maxTime) {
                fleets++;
                maxTime = time;
            }
        }

        return fleets;
    }
}