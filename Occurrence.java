
import java.util.HashMap;

class Occurrence {

    public static int countOccurrenceMap(int[] arr, int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Build frequency map
        for (int num = 0; num <= arr.length - 1; num++) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Return target frequency
        return freq.getOrDefault(target, 0);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 2, 6};
        int target = 2;

        int result = countOccurrenceMap(arr, target);
        System.out.println("Occurrences of " + target + " = " + result);
    }
}
