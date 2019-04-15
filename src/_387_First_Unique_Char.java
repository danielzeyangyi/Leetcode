import java.util.HashMap;
import java.util.Map;

public class _387_First_Unique_Char {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if( !map.containsKey(current)){
                map.put(current, i);
            } else {
                map.put(current, -1);
            }
        }

        for ( char c : s.toCharArray() ) {
            if (map.get(c) != -1) {
                return map.get(c);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int test = firstUniqChar("leetcode");
        System.out.println(test);
    }
}
