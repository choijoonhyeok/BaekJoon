import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int c = s.nextInt();
        long Xarray[] = new long[n];

        for (int i = 0; i < n; i++) {
            Xarray[i] = s.nextLong();
        }
        Arrays.sort(Xarray);

        long min = 1;
        long max = Xarray[n - 1] - Xarray[0];
        long result = 0;

        while (min <= max) {
            long mid = min + (max - min) / 2;

            if (canPlaceRouters(Xarray, n, c, mid)) {
                result = mid; // Update result if routers can be placed
                min = mid + 1; // Try for a larger minimum distance
            } else {
                max = mid - 1; // Reduce the search space
            }
        }

        System.out.print(result);
    }

    // Helper function to check if routers can be placed with minimum distance `dist`
    private static boolean canPlaceRouters(long[] houses, int n, int c, long dist) {
        int count = 1; // Place the first router in the first house
        long lastRouterPosition = houses[0];

        for (int i = 1; i < n; i++) {
            if (houses[i] - lastRouterPosition >= dist) {
                count++;
                lastRouterPosition = houses[i];
            }
        }

        return count >= c; // Return true if at least `c` routers can be placed
    }
}
