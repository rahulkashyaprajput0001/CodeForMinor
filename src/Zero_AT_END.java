public class Zero_AT_END {
    public static void main(String[] args) {
        int ar[] = {2,0,3,5,0,1};
        StringBuffer sb =  new StringBuffer();
        for(int i=0;i< ar.length ;i++)
        {
            if(ar[i] != 0)
                sb=sb.append(ar[i]);
        }
        zeroATEnd(sb,ar);
    }
    public static void zeroATEnd(StringBuffer sb,int ar[] ){
        int sbLen = sb.length();
        for(int i =0 ;i< ar.length;i++){
            if(i < sbLen && i != sbLen){
                ar[i] = Character.getNumericValue(sb.charAt(i));
            }else{
                ar[i]=0;
            }
        }
        for(int i=0;i<ar.length; i++)
            System.out.print(ar[i]+",");
    }
    
}
