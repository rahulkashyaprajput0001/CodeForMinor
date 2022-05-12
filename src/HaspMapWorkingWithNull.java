import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HaspMapWorkingWithNull {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "firstIndesx");
        map.put(null, "null value");
        map.put(1, "dupfirstIndesx");
        System.out.println( map.get(null));
        map.put(null, "secondNullfirstIndesx");
        System.out.println(map);
         for (Map.Entry<Integer,String> entry : map.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
    }
}
