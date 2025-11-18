
class Solution {

    int missingNum(int arr[]) {
        // code here

        int n = arr.length + 1;
        int totalsum = n * (n + 1) / 2;
        int arrsum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrsum += arr[i];

        }
        return totalsum - arrsum;

    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 2, 3, 5};
        System.out.println(sol.missingNum(arr1)); // 4

        int[] arr2 = {0, 1, 2, 3, 5};
        System.out.println(sol.missingNum(arr2)); // 4

        int[] arr3 = {0, 1, 3};
        System.out.println(sol.missingNum(arr3)); // 2
    }
}
