import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TenantForFlatMapTest {
    int tID;
    String tname;

    public List<List<Integer>> getPhoneNumbers() {
        return phoneNumbers;
    }

    List<List<Integer>> phoneNumbers = new ArrayList<>();


    public static void main(String[] args) {

        TenantForFlatMapTest obj = new TenantForFlatMapTest();
        obj.phoneNumbers.add(0,Arrays.asList(1234456,656123456,765432,54565675,3423423,90897));
        obj.phoneNumbers.add(1,Arrays.asList(1234456,656123456,765432,54565675,3423423,90897));
        List<List <Integer>> mNunber = obj.getPhoneNumbers();
        mNunber.stream().flatMap(n-> n.stream()).collect(Collectors.toList());
        List<Integer>ls =     mNunber .stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
        System.out.println(ls);

}
}


