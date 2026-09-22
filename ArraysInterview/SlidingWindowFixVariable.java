public class SlidingWindowFixVariable {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2, 6 };
        int k = 3;
        System.out.println("MaxSum: " + slidingWindowSum(arr, k));
    }

    public static int slidingWindowSum(int[] arr, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Sliding
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}