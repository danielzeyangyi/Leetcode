import java.util.ArrayList;
import java.util.List;

public class _78_subsets {
    // DFS
    public static List<List<Integer>> subsets(int[] nums) {
        // corner case
        if(nums == null || nums.length == 0) return null;
        List<Integer> set = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        helper(nums, set, 0, result);
        return result;
    }

    public static void helper(int[] nums, List<Integer> set, int index, List<List<Integer>> result){
        // base case when reach bottom
        if(index == nums.length){
            result.add(new ArrayList<>(set));
            return;
        }

        // 2 branches: add current index num and not add
        set.add(nums[index]);
        helper(nums, set, index + 1, result); // add
        set.remove(set.size() - 1);
        helper(nums, set, index + 1, result); // not add
    }


    public static void main(String[] args) {
        int [] testArr = {1,2,3};
        System.out.println(subsets(testArr));
    }
}
