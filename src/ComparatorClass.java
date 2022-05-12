import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorClass {
    public static void main(String[] args) {
        List<Employee> ls = new ArrayList<>();
        ls.add(new Employee(6,"rahul"));
        ls.add(new Employee(5,"ajay"));
        Collections.sort(ls,Employee.nameCom);
        System.out.println(ls);
        Collections.sort(ls,Employee.salCom);
        System.out.println(ls);
    }
}
