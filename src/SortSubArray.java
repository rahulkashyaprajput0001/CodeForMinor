public class SortSubArray {
    public static void main(String[] args) {
        int ar[ ] = {1 ,5 ,4 ,3 ,10 ,31 ,45};
        findHasSubArray(ar,ar.length); 
    }
  
    
    public static void  findHasSubArray(int ar[],int n){
       int highDisIndex = 0,lowDisIndex = -1;
        for(int r = n-1 ; r>=0 ;r--){
            if(ar[r] < ar[r-1] && r-1 >= 0 ){
                highDisIndex = r;
                System.out.println(highDisIndex);
                break;
            
        }
        }
        
        for(int l = 0 ; l < n ;l++){
            if((ar[l]) > ar[l+1] && l+1 <= n-1){
                lowDisIndex = l ;
                System.out.println(lowDisIndex);
                break;
            }
    }
}
}
