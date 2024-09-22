import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        List<Integer> numList;
        numList = Arrays.asList(1,4,2,6,44,78,100,23);
        Integer num = numList.stream().sorted().skip(numList.size()-2).findFirst().get();
        System.out.println(num);
    }
}
