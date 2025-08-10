package Medium.BUYSELL_STOCKS;

public class onetraverse {
    static int findmaxprofit(int arr[]){
        int minsofar = arr[0];
        int maxprofit = 0;
        for(int i = 0; i < arr.length; i++){
            int profit = arr[i] - minsofar;
            minsofar = Math.min(arr[i],minsofar);
            maxprofit = Math.max(maxprofit , profit);

        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(findmaxprofit(arr));
    }
    
}
