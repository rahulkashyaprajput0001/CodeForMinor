import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoubleEveryElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,5);
        list = list.stream().map(ele->ele*2).collect(Collectors.toList());
                 list.stream().distinct().collect(Collectors.toList());
        list.forEach(ele->{
           System.out.println(ele);
       });
        int sum = Stream.of(1,2,3,4).reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }

}
