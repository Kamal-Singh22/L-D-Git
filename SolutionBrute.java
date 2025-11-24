
import java.util.HashMap;

class SolutionBrte {

    public static int majorityAndMissing(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int majorityElement = -1;
        for (int x = 0; x < n; x++) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            if (freq.get(x) > n / 2) {
                majorityElement = x; // early exit
            }
        }

        int expectedLength = n + 1;
        int totalSum = expectedLength * (expectedLength + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        int missingNumber = totalSum - arrSum;

        System.out.println("Majority Element: " + majorityElement);
        return missingNumber;
    }
}
