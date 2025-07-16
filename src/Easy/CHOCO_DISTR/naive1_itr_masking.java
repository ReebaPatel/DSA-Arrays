package Easy.CHOCO_DISTR;

public class naive1_itr_masking {
    static int findMinDiff(int arr[], int m) {
        int n = arr.length;
        int total = 1 << n; // total masks = 2^n
        int bestDiff = Integer.MAX_VALUE; // track the smallest difference

        for (int mask = 0; mask < total; mask++) {
            if (Integer.bitCount(mask) != m)
                continue;

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) {
                    int val = arr[j];
                    min = Math.min(min, val);
                    max = Math.max(max, val);
                }
            }

            int diff = max - min;
            if (diff < bestDiff) {
                bestDiff = diff;
            }
        }

        return (bestDiff == Integer.MAX_VALUE) ? 0 : bestDiff;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
        int result = findMinDiff(arr, 3);
        System.out.println("Minimum difference is " + result);
        // Expected: Minimum difference is 2
    }
}
