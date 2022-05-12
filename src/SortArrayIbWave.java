public class SortArrayIbWave {
    static public void swap(int[] ar,int evenPos,int oddPos){
        int temp;
        temp = ar[evenPos];
        ar[evenPos] = ar[oddPos];
        ar[oddPos] = temp;    
    }
    
 static public  void sortInWaveForm(int[] ar,int n){
       for(int i=0;i<n;i= i+2){
          
           if(i-1 > 0 && ar[i]< ar[i-1]){
               swap(ar, i, i-1);
           }
            if(i+1 < n && ar[i]< ar[i+1]){
               swap(ar,i,i+1);
           }
       }
}
 
 public static void printarr(int[] arr,int n){
       for(int i=0;i<n;i++){
           System.out.print(arr[i] +",");
       }
   }
 
  public static void main(String[] args) {
        int arr[] = {10, 90, 49, 2, 1, 5, 23},n;
        n = arr.length;
        sortInWaveForm(arr, n);
        printarr(arr, n);   
    }   
}

