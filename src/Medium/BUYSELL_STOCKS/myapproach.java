package Medium.BUYSELL_STOCKS;

public class myapproach {
    static int findmaxprofit(int arr[]){
        int maxProfit = 0;
        int minprice = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (minprice < arr[i]){
                int profit = arr[i] - minprice;
                maxProfit = Math.max(maxProfit, profit);
            } else{
                minprice = arr[i]; 
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(findmaxprofit(arr));
    }
}
