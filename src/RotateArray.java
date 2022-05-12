public class RotateArray {
    public static void main(String[] args) {
        int ar[] = {1,2,3},rotBy = 2;
        
        reverseElement(ar, 0, rotBy - 1);
        reverseElement(ar, rotBy, ar.length - 1);
        reverseElement(ar, 0, ar.length - 1);
        printArray(ar);
        
    }
    public static void reverseElement(int ar[],int low,int high){
       
        for(int i= low,j=high; i<=j; i++,j-- ){
            swap(ar, i, j);
            
        }
    }
    public static void swap(int ar[],int i,int j){
        int data;
        if(i >= 0 && j >= 0 ){
        data=ar[i];
        ar[i]=ar[j];
        ar[j]=data;
        }
    }
    public static void printArray(int ar[])
    {
        for(int i = 0;i< ar.length ;i++)
        {
            System.out.print(ar[i]);
        }
    }
    
}
