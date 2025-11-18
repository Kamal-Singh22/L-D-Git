
class Solution {

    int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int curr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            maxSoFar = Math.max(maxSoFar, curr);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(sol.maxSubarraySum(arr1)); // 11

        int[] arr2 = {-2, -4};
        System.out.println(sol.maxSubarraySum(arr2)); // -2

        int[] arr3 = {5, 4, 1, 7, 8};
        System.out.println(sol.maxSubarraySum(arr3)); // 25
    }
}
