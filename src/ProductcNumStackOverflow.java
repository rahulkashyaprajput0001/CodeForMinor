public class ProductcNumStackOverflow {
    public static void main(String[] args) {
       // int ar[]={1,2,3,4};
         int ar[]={1,2,1,3,4};
        int leftAR[] = new int[4];
        int rightAR[] = new int[4];
        int  p =1;
        for(int i=4-1;i>=0;--i) {
            rightAR[i]=p;
            p*=ar[i];
            System.out.print(rightAR[i]+" ");
}     System.out.println();
        int k=1;
         for(int i=0;i<4;++i) {
            leftAR[i]=k;
            k*=ar[i];
             System.out.print(leftAR[i]+" ");
}
        
    }
    
}
