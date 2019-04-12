import java.util.ArrayList;
import java.util.List;

public class _412_Fizz_Buzz {

    public static List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<String>();

        for(int i = 1; i <= n; i++ ){
            boolean divisible3 = i % 3 == 0;
            boolean divisible5 = i % 5 == 0;

            if(divisible3 && divisible5){
                arr.add("FizzBuzz");
            } else if (divisible3) {
                arr.add("Fizz");
            } else if (divisible5) {
                arr.add("Buzz");
            } else {
                arr.add(Integer.toString(i));
            }
        }
        return arr;
    }

}

