import java.util.HashSet;
import java.util.Set;

public class Eleven {

    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int max = 0;
        Set<Character> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            while(set.contains(s.charAt(right))){

                set.remove(s.charAt(left));
                left++;

            }
            set.add(s.charAt(right));
            max = Math.max(max,right - left +1);

        }

        return max;
    }

    public static void main(String[] args) {
        Eleven obj = new Eleven();

        String s = "pwwkew";

        System.out.println(obj.lengthOfLongestSubstring(s));
    }
}
