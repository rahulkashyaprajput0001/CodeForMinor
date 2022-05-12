import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class javaComparator implements Comparable<javaComparator>{
    int age,sal;
    String name;

    public javaComparator(int age,int sal,String name) {
        this.age = age;
        this.sal = sal;
        this.name = name;
    }
    
    public static void main(String[] args) {
        javaComparator [] jcom = new javaComparator[3];
         jcom[0] = new javaComparator(1, 20003, "abc");  
          jcom[1] = new javaComparator(20, 24000, "xgc");
          jcom[2] = new javaComparator(14, 42000, "cbi");
          
          ArrayList<javaComparator> list =  new ArrayList<>();
          list.add(jcom[0]);
                    list.add(jcom[1]);

                              list.add(jcom[2]);
                              for(javaComparator jc : list){
                                 // System.out.println(jc.name);
                                 // jc.name = "test";
                              }
                              for(javaComparator list2 : list){
                                  System.out.println(list2.name);
                              }

          
         // Arrays.Sort(jcom);
        //   Arrays.sort(jcom);
           //for (int i=0; i<jcom.length; i++) {
            //System.out.println(jcom[i].name); 
           //}
         // System.out.println(jcom);

    }


    @Override
    public int compareTo(javaComparator o) {
       return   o.name.compareTo(this.name);
    }
}
