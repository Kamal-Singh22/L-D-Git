
// class majority {
//     // Brute-force: O(n^2)
//     public static int majorityBrute(int[] nums) {
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             int count = 0;
//             for (int j = 0; j < n; j++) {
//                 if (nums[j] == nums[i]) {
//                     count++;
//                 }
//             }
//             if (count > n / 2) {
//                 return nums[i];
//             }
//         }
//         return -1; // 
//     }
//     // For quick testing
//     public static void main(String[] args) {
//         int[] a = {2, 2, 1, 1, 1, 2, 2};
//         System.out.println("Brute: " + majorityBrute(a));
//     }
// }
// HashMap approach
import java.util.HashMap;

class Solution {

    public static int majorityHashMap(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            if (freq.get(x) > n / 2) {
                return x; // early exit

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("HashMap: " + majorityHashMap(a)); // 2
    }
}
