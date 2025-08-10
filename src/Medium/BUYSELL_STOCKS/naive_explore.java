package Medium.BUYSELL_STOCKS;

public class naive_explore {
    static int findmaxprofit(int arr[]){
        int maxProfit = 0;
        
        for (int i = 0;  i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                int profit = arr[j] - arr[i];
                maxProfit  = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(findmaxprofit(arr));
    }
}
