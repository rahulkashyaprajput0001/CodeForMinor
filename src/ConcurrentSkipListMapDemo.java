import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collectors;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String > map = new ConcurrentSkipListMap<>(Collections.reverseOrder());
        map.put(1,"A");
        map.put(5,"B");
        map.put(3,"C");
        map.put(2,"D");
        System.out.println(map);
       //ConcurrentSkipListMap<Integer,String > m =  map.descendingMap();
        System.out.println(map);
        int arr[] = new int[]{1,2,3,4};
       int sum =  Arrays.stream(arr).sum();
        System.out.println(sum);
        List<Integer> l = (List<Integer>) Arrays.asList(1,2,3,4);
        int i = l.stream().reduce(0,Integer::sum);
          Integer ii = l.stream().mapToInt(Integer ::intValue).sum();
        Integer o = (Integer) l.stream().collect(Collectors.summingInt(Integer ::intValue));
        System.out.println(o);



    }
    static int  arr[] = new int[]{1,2,3,4};
    List<Integer> l = Arrays.asList(1,2,3,4);

   int i = l.stream().reduce(0,Integer::sum);
    Integer ii = l.stream().mapToInt(Integer::intValue).sum();


}
