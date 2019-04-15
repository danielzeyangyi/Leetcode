public class _125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        s = s.toLowerCase();

        for(int head = 0, tail = s.length() -1; head < tail; head++, tail--) {
            while (head < tail && !Character.isLetterOrDigit(s.charAt(head))) {
                head++;
            }
            while (head < tail && !Character.isLetterOrDigit(s.charAt(tail))) {
                tail--;
            }
            if(s.charAt(head) != s.charAt(tail)) return false;
        }
        return true;
    }
}
