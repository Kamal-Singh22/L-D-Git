
public class revN {

    public static void main(String[] args) {
        // int n = 1234321;
        // int originalN = n;
        // int rev = 0;
        // while (n > 0) {
        //     int lastnum = n % 10;
        //     rev = rev * 10 + lastnum;
        //     n = n / 10;

        // }
        // System.out.println("Reversed Number: " + rev);
        // if (originalN == rev) {
        //     System.out.print("Palindrome");
        // } else {
        //     System.out.print("Not a Palindrome");
        // }
        String str = "mafdam";
        int start = 0;
        Boolean isPalindrome = true;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {

                System.out.print("is not palindrome");
                isPalindrome = false;

                break;

            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.print("is palindrome");
        }
    }
}
