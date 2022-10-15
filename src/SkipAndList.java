import java.util.Arrays;
import java.util.List;

public class SkipAndList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,78,9);
        list.stream().skip(1).limit(4).forEach(System.out::println);

    }
}
