import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveFromSecList {
    public static void main(String[] args) {
        List<String> orignalList = new ArrayList<>();
        List<String> tempList = new ArrayList<>();
     //   orignalList = Arrays.asList("Test","Wonder","Test","Hiii");
        orignalList.add("Test");
        orignalList.add("Wonder");
        orignalList.add("Test");
        orignalList.add("Hii");
         tempList=  orignalList.stream().filter(ele -> ele.equalsIgnoreCase("Test")).collect(Collectors.toList());
        orignalList.removeAll(tempList);
        System.out.println(orignalList);
        System.out.println(tempList);

    }
}
