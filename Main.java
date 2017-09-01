import java.util.List;
import java.util.Arrays;

/**
 * Created by EG OLIVER RC on 8/31/2017.
 */
public class Main {
    public static void main(String[] args){


        List<String> myArrayList = Arrays.asList("able", "ale", "apple", "bale", "kangaroo");
        System.out.println( new LongestWordFinder().run("abppplee", myArrayList) );
    }
}
