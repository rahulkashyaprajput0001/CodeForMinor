import java.util.ArrayList;
import java.util.List;

public class RemoveListFromAnother {
    public static void main(String args[]) throws Exception {

        List list = new ArrayList();
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("C");

        List list2 = new ArrayList();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list.removeAll(list2);
        ArrayList list1= new ArrayList<>();// will it work
        list1.add(1);
        list1.add("gfg");
        System.out.println(list1);

        System.out.println(list);
    }
}