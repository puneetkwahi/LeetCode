import java.util.HashMap;
import java.util.Map;

public class RomanInteger {


    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        //  Input: s = "MCMXCIV"
        int sum = 0;
        if (s != null) {
            sum = romanMap.get(s.charAt(s.length() - 1));
            for (int i = s.length() - 2; i >= 0; i--) {
                if (romanMap.containsKey(s.charAt(i)) && (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1)))) {
                    sum = sum - romanMap.get(s.charAt(i));
                } else if (romanMap.containsKey(s.charAt(i)) && (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1)))) {
                    sum = sum + romanMap.get(s.charAt(i));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

   /*     Input: s = "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
    */


        //String s = "MCMXCIV";
        // String s = "III";
        //"MCDLXXVI" = 1476
        System.out.println(romanToInt("MCDLXXVI"));
    }
}
