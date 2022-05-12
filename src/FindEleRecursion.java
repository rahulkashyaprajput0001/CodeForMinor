public class FindEleRecursion {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6,7,5,20,3,4,6};
        int len  = 9-1;
        int res = findEle(ar,20,len);
        if(res != -1){
            System.out.println(res);
        }else{
            System.out.println("not found");
        }
      
    }
      static  public int findEle(int ar[],int tar,int len){
        if(ar[len] == tar)
            return len;
        else{
            return findEle(ar,tar,len-1);
        }
    }
}
