import java.util.HashMap;
import java.util.Map;

public class _13_Roman_to_Integer {

    public static int romanToInt(String s) {
        if(s==null || s.length()== 0 ) return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] arr = s.toCharArray();
        if(s.length() == 1) return  map.get(arr[0]);
        int sum = map.get(arr[s.length()-1]);

        for(int i=s.length()-2; i >= 0; i--) {
            int l = map.get(arr[i]);
            int r = map.get(arr[i+1]);
            sum = l < r? sum - l: sum + l;
        }

        return sum;
    }
}
