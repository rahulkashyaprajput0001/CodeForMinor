import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareabelClass {


    public static void main(String[] args) {

        List<Age> ls = new ArrayList<>();
        ls.add(new Age(1));
        ls.add(new Age(0));ls.add(new Age(14));
        ls.add(new Age(4));
        Collections.sort(ls);
        System.out.println(ls);
//        ls.stream().filter(l -> l.age>13).map(l -> l.age).forEach(System.out ::println);
//        System.out.println("----");
//        ls.stream().filter(l -> l.age>13).forEach(System.out ::println);
//        System.out.println("----");
//        //  Collections.sort(ls);
//          ls.stream().sorted((o1, o2) -> o1.age- o2.age).forEach(System.out ::println);
        //hell testimg
        //hell0testimg
      //  System.out.println(ls);
    }
}
