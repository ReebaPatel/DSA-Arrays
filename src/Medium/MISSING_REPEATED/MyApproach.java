package Medium.MISSING_REPEATED;

public class MyApproach {
    static int[] findminrep(int arr[]) {

        int n = arr.length;
        int repeated = 0;
        int missing = 0;
        for (int i = 1; i <= n; i++) {

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count == 0) {
                missing = i;
            } else if (count == 2) {
                repeated = i;
            }
        }
        return new int[]{repeated, missing};
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        int[] result = findminrep(arr);
        System.out.println(result[0]+ ", " + result[1]);
    }

}


