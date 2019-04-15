public class _242_Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        // Solution 1 : hash table, O(n) / O(1)
        if (s.length() != t.length()) {
            return false;
        }

        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a'] ++;
            table[t.charAt(i) - 'a'] --;
        }

        for(int hash : table) {
            if ( hash != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean test = isAnagram("anagram", "nagaram");
        System.out.println(test);

    }
}
