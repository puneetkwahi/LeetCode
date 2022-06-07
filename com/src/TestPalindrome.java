public class TestPalindrome {

    static boolean palindrome(int num) {
        String str = String.valueOf(num);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (!(str.charAt(i) == str.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;

    }


    public static void main(String[] args) {
        int num = 123211;
        System.out.println(palindrome(num));

    }
}
