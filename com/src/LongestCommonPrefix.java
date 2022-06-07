public class LongestCommonPrefix {

    /*
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
     */
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) { return ""; }
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args) {

         //String[] strs = {"flower", "flow","flight"};
       // String[] strs = {"cir", "car"};
        String[] strs = {"c","acc","ccc"};
      //  ["c","acc","ccc"]
        StringBuilder sb = new StringBuilder();
        String str = strs[0];
        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
        }
        boolean flag = true;
        for (int i = 0; i < minimumLength; i++) {
            if (strs.length > 1) {
                if (flag) {
                    for (int j = 1; j < strs.length; j++) {
                        String strInner = strs[j];
                        if (i < strInner.length() && str.charAt(i) == strInner.charAt(i)) {
                            if (j == strs.length - 1) {
                                sb.append(str.charAt(i));
                            } else {
                                continue;
                            }
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
            } else {
                sb.append(str);
                break;
            }
        }
        System.out.println(sb.toString());
        System.out.println(longestCommonPrefix(strs));

    }

}
