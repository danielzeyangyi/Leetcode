public class _198_House_Robber {
    public int rob(int[] nums) {
        int prevMax = 0;
        int currentMax = 0;

        for (Integer num : nums) {
            int tmp = currentMax;
            currentMax = Math.max(prevMax + num, currentMax );
            prevMax = tmp;
        }
        return currentMax;
    }
}
