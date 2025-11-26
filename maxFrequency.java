
class maxFrequency {

    public static int frequencyCount(int[] arr) {
        int maxCount = 0;
        int n = arr.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                ans = arr[i];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 1, 2, 5, 5, 6, 6, 2, 1, 1};
        System.out.println(frequencyCount(arr));
    }
}
