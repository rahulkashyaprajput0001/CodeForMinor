import java.lang.reflect.Array;
import java.util.Arrays;

public class ro {
    public static void main(String[] args) {
       int a[]= {39356, 87674, 16667, 54260, 43958, 70429, 53682, 6169, 87496, 66190, 90286, 4912, 44792, 65142, 36183, 43856, 77633, 38902, 1407, 88185, 80399, 72940, 97555, 23941, 96271, 49288, 27021, 32032, 75662, 69161, 33581, 15017 ,56835, 66599, 69277, 17144, 37027, 39310, 23312, 24523, 5499, 13597, 45786, 66642, 95090, 98320, 26849, 72722, 37221, 28255, 60906}
    ;
       int re[]= circularArrayRotation(a, 51);
        for(int i=0;i<re.length;i++){
            System.out.println(i+"--"+ re[i]);
        }
}
    static int[] circularArrayRotation(int[] a, int k) {

        int alen = a.length;
        int traverseBy = alen-k;
        int tmpArr[]= new int[alen];
        int tmpC=0;
        for(int i= traverseBy;i< alen;i++){
            tmpArr[tmpC]=a[i];
            tmpC=tmpC+1;
        }
        for(int i=0;i< traverseBy;i++){
            
            tmpArr[tmpC]=a[i];
            tmpC=tmpC+1;
    }
   return tmpArr;
}
}
