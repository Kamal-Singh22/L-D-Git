
public class occerence {

    public static int countOccerence(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] asdf) {
        int[] arr = {1, 2, 3, 4, 2, 5, 2, 6};
        int target = 2;
        int result = countOccerence(arr, target);
        System.out.println("The occerence of " + target + "is: " + result);
    }
}
