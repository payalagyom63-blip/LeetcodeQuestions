import java.util.Arrays;

public class Twelve {

    public String longestCommonPrefix(String[] strs) {

        String res = "";
        if (strs == null || strs.length == 0) {
            return res;
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;

        while (c < first.length()) {
            if (first.charAt(c) == last.charAt(c)) {
                c++;
            } else {
                break;
            }
        }

        if(c==0){
            return res;
        }
        else {
            return first.substring(0, c);
        }
    }

    public static void main(String[] args) {
        Twelve obj = new Twelve();

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(obj.longestCommonPrefix(strs));
    }
}
