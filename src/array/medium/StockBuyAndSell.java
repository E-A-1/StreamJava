package array.medium;

public class StockBuyAndSell {

    private static long buyAndSellStocks(int arr[]) {
        int minElement = Integer.MAX_VALUE;
        int maxPro = 0;

        for (int i = 0; i < arr.length; i++) {
            minElement = Math.min(minElement, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minElement);

        }

        return maxPro;
    }

    public static void main(String[] args) {

        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("the max stock buy and sell is " + StockBuyAndSell.buyAndSellStocks(arr));
    }
}
