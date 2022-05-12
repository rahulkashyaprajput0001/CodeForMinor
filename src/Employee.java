import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    int sal;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "sal=" + sal +
                ", name='" + name + '\'' +
                '}';
    }

    Employee(int sal, String name){
        this.sal = sal;
        this.name = name;

    }

    public static Comparator<Employee>salCom = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.sal-o2.sal;
        }
    };
    public static Comparator<Employee>nameCom = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }
//    @Override
//    public int compare(Employee o1, Employee o2) {
//       return o1.sal-o2.sal;
//    }
}
