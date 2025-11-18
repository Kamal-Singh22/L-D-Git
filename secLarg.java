
class Solution {

    public int getSecondLargest(int[] arr) {
        // code here
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == -1) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = sol.getSecondLargest(arr);
        System.out.println("The second largest element is: " + result);
    }

}
