import java.util.HashSet;

public class FindPares {
    
    public static void main(String[] args) {
        int ar[] = {5,3,6,4,8,1,7,2};
        
        int len = ar.length;
        int sum =9;
        getPares(ar,sum);
    }

    public static void  getPares(int a[],int sum) {
        HashSet hSet = new HashSet();
        int diff;
        for (int curVal : a) {
            diff=sum-curVal;
            if(!hSet.contains(diff)){
                hSet.add(curVal);
            }
            else{
                System.out.printf("("+diff+"," +curVal+")");
            }
        }
        
        
    }
}
    

