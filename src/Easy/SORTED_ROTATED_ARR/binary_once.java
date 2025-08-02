package Easy.SORTED_ROTATED_ARR;

public class binary_once {
    public static int search(int arr[], int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[low] < arr[mid]) {
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            else {
                if (arr[mid] < key && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {       
        int arr[] = { 8, 9, 10, 0, 1, 2, 3, 4 };
        int key = 3;
        int n = arr.length;        
        System.out.println(search(arr, 0, n - 1, key));
    }

}
