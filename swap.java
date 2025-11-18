
class swap {

    public static void swap(int i, int arr[], int n) {
        if (i >= n / 2) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        swap(i + 1, arr, n);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        swap(0, arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
