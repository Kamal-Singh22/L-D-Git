
class primeN {

    public static void main(String[] args) {
        int n = 11;
        if (n == 1 && n == 2) {
            System.out.print(n + " is not a prime number");
        } else {
            for (int i = 2; i <= n; i++) {

                if (n % i == 0) {
                    System.out.print(n + " is not a prime number");
                    break;
                } else {
                    System.out.print(n + " is a prime number");
                    break;
                }
            }

        }
    }
}
