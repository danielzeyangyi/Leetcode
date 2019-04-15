public class _70_Climbing_Stairs {

    // bottom up, intuitive way
    public int climbStairs(int n) {
        if (n == 0) return 1;
        if (n ==1) return 1;

        int[] stairs = new int[n+1];
        stairs[0] = 1;
        stairs[1] = 1;

        for (int i = 2; i <= n; i++) {
            stairs[i] = stairs[i-1] + stairs[i-2];
        }
        return stairs[n];
    }

    // to save little bit space, we only need to store steps take for 2 previous stairs
    public int climbStairs_improve(int n) {
        if (n == 0) return 1;
        if (n ==1) return 1;

        int first = 1;
        int second = 2;
        for(int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second; // sum of first + second
    }
}
