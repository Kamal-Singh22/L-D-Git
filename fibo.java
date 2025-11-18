
class fibo {

    public static void fiboN(int n) {

        // if (n <= 1) {
        //     return n;
        // }
        // return fiboN(n - 1) + fiboN(n - 2);
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] addf) {
        int n = 5;
        fiboN(n);
    }
}
