public class myTenthApp {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);

        if (result.length == 0) {
            System.out.println("Empty or null array.");
        } else {
            System.out.println("Negative count: " + result[0]);
            System.out.println("Positive sum: " + result[1]);
        }
    }

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int negativeCount = 0;
        int positiveSum = 0;

        for (int num : input) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveSum += num;
            }
        }

        return new int[] {negativeCount, positiveSum};
    }
}
