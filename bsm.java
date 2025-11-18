
class bsm {

    public static void main(String[] adfg) {
        int n = 765456;
        //int count = 0;
        int rev = 0;
        while (n > 0) {
            int lastnum = n % 10;
            // System.out.print(lastnum + " ");

            rev = rev * 10 + lastnum;
            // System.out.println(rev);

            // count = count + 1;
            n = n / 10;
        }

        System.out.print(rev);
    }
}
