import java.util.LinkedList;
import java.util.Queue;


 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class _958_Is_Complete_BST {

    public static boolean isCompleted(TreeNode root){
        if(root == null) return true;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean flag = false;
        while( !queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if(curr.left == null) {
                flag = true;
            } else if(flag) {
                return false;
            } else {
                queue.offer(curr.left);
            }

            if(curr.right == null) {
                flag = true;
            } else if (flag) {
                return false;
            } else {
                queue.offer(curr.right);
            }
        }
        return true;
    }
}
