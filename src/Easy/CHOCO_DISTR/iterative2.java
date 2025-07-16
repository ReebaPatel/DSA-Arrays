package Easy.CHOCO_DISTR;
import java.util.ArrayList;
import java.util.List;

public class iterative2 {
    public static void chocolateDistribution(int[] nums, int m) {
        int n = nums.length;
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());  // Start with empty subset

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNum = nums[i];
            int subsetCount = subsets.size();

            for (int j = 0; j < subsetCount; j++) {
                List<Integer> oldSubset = subsets.get(j);
                List<Integer> newSubset = new ArrayList<>(oldSubset);
                newSubset.add(currentNum);

                if (newSubset.size() == m) {
                    int min = Integer.MAX_VALUE;
                    int max = Integer.MIN_VALUE;
                    for (int val : newSubset) {
                        min = Math.min(min, val);
                        max = Math.max(max, val);
                    }
                    int diff = max - min;
                    minDiff = Math.min(minDiff, diff);
                } else {
                    subsets.add(newSubset);  // Only keep subsets smaller than m
                }
            }
        }

        System.out.println("Minimum difference is: " + minDiff);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 3;

        chocolateDistribution(arr, m);
        // Expected output: Minimum difference is: 2
    }
}
