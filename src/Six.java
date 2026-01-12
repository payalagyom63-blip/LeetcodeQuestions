public class Six {

    public int maxProfit(int[] prices) {

        int min = prices[0];
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(prices[i], min);
        }

        return max;
    }

    public static void main(String[] args) {
        Six obj = new Six();

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(obj.maxProfit(prices));
    }
}
