package Easy.SORTED_ROTATED_ARR;

public class binary_twice {
    public static int findPivot(int arr[],int lo,int hi){
        while (lo < hi){
            if( arr[lo] < arr[hi]){
                return arr[lo];
            }
            int mid = (lo + hi) / 2;
            if (arr[mid] > arr[hi]){
                lo = mid + 1;
            }
            else {
                hi = mid;
            }

        }
        return lo;
    }

    public static int binarySearch(int array[], int low, int high, int x){
        while (low < high){
            int mid = low + (high - low)/2;
            if (array[mid] == x){
                return mid;                
            }
            if (array[mid] < x){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int search(int arr[] , int target){
        int n = arr.length;
        int pivot = findPivot(arr, 0,n-1);
        if (arr[pivot] == target ){
            return pivot;
        }
        if (pivot == 0){
            return binarySearch(arr, 0,n-1 , target);
        }
        if(arr[0] <= target){
            return binarySearch(arr, 0, pivot-1, target);
        }
        else {
            return binarySearch(arr, pivot, n-1, target);
        }
    }
    public static void main(String[] args) {
        int array[] = {8, 9, 10, 0, 1, 2, 3, 4};
        int key = 3;
        System.out.println(search(array, key));

    }
}
