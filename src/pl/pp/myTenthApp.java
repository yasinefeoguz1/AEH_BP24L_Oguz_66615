public class myTenthApp {

    public static void main(String[] args) {
        // Example input array
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};

        // Call the countAndSumElements method
        int[] result = countAndSumElements(input);

        // Print results
        System.out.println("Number of negative elements: " + result[0]);
        System.out.println("Sum of positive elements: " + result[1]);
    }

    // The method to count negative elements and sum positive ones
    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0]; // Return an empty array if input is null or empty
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

        return new int[] {negativeCount, positiveSum}; // Return an array with negative count and positive sum
    }
}

