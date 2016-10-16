import java.util.ArrayList;
import java.util.List;

/**
 * Created by fankai on 2016/10/16.
 */
public class _412FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            if(i % 15 == 0){
                result.add("FizzBuzz");
                continue;
            }
            if(i % 3 == 0){
                result.add("Fizz");
                continue;
            }
            if (i % 5 == 0){
                result.add("Buzz");
                continue;
            }
            result.add(String.valueOf(i));
        }
        return result;
    }
}
