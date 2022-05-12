import java.util.ArrayList;

public class FinalArrayList {
    public static void main(String[] args) {
        final ArrayList<String> list = new ArrayList<>();
        ArrayList list1 = new ArrayList<>();
        list1.add(1);
        list1.add("sdfg");
        System.out.println(list1);
        list.add("abc"); //allowed
        list.add("pqr"); //allowed
        System.out.println(list);
         ArrayList<String> list2 = new ArrayList<>();
        // list = list;
    }
}
