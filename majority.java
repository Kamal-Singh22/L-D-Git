
class majority {

    // Brute-force: O(n^2)
    public static int majorityBrute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return -1; // 
    }

    // For quick testing
    public static void main(String[] args) {
        int[] a = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Brute: " + majorityBrute(a));
    }
}
