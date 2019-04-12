public class _344_Reverse_String {
    public static void reverseString(char[] s) {
        // run helper to recursively swap two char at a time
        reverseString(s, 0, s.length - 1);
    }

    public static void  reverseString(char[] s, int i, int j) {
        if(i < j) {
            // execute swap
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            reverseString(s,i + 1,j -1);
        }
    }
}
