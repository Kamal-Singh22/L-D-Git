
class rec1 {

    //sum of first n natural numbers
    // public static int recursion1(int n) {
    //     if (n == 0) {
    //         return 0;
    //     } else {
    //         return n + recursion1(n - 1);
    //     }
    // }
    // multiplication of first n natural numbers
    public static int recursion1(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursion1(n - 1);
        }
    }

    public static void main(String[] asf) {
        System.out.print(recursion1(5));
    }
}
