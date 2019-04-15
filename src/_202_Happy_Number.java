import java.util.HashSet;
import java.util.Set;

public class _202_Happy_Number {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sumSquare, remain;

        while (set.add(n)) {
            sumSquare = 0;
            while (n > 0) {
                remain = n % 10;
                sumSquare += remain * remain;
                n = n/10;
            }
            if (sumSquare == 1) {
                return true;
            } else {
                n = sumSquare;
            }
        }
        return false;
    }


}
