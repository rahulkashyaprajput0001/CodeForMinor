public class FindSmallestPostiveNumber {
    
    public static void main(String[] args) {
        int arr[] = {1,3,4,7};
       // int arr[] = {1, 1, 0, -1, -2};

        int val,tmp;
        
        for(int i =0; i<arr.length;i++){
          if(arr[i] >=1 && arr[i] <=arr.length && arr[i] != arr[arr[i]-1]){
                tmp  = arr[arr[i]-1];
               arr[arr[i]-1] = arr[i];
                        
                       arr[i]=  tmp;
                
            }
        }
        
        for(int i = 0 ;i<arr.length ; i++){
            if(arr[i] != i+1){
            System.out.println(i+1);
            break;
            }
        }
        
    }
}
