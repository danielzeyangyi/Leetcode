import java.util.Stack;

public class _234_Palindrome_LinkedList {

    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> stack = new Stack<Integer>();

        while (fast!= null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) slow = slow.next; // move slow a node forward if there are odd nodes

        while (slow != null) {
            if(stack.pop() != slow.val) return false;
            slow = slow.next;
        }
        return true;
    }
}
