public class ProductOfNumerExcludingI {
    public static void main(String[] args) {
        int    leftAR[]= new int[4],rigthAR[] = new int[4];
        Integer countLeft=0,countRight=0;
        int ar[] = {1,2,3,4};
        for(int i=0;i<ar.length;i++){
            leftandRightPro(i,ar,leftAR,rigthAR,countLeft,countRight);
        }
        System.out.println(countLeft +" "+ countRight);
                
        for(int i=0;i<ar.length;i++){
            System.out.println( leftAR[i] +" "+ rigthAR[i]);
        }
    }
    public static void leftandRightPro(int i,int[]ar,int[]leftAR,int[] rightAR,Integer countLeft,Integer countRight){
        int exactR =i,exactL = i,Pl=1,PR=1;int prR=1,prL=1;
        int lA = i-1,rA = i+1;
        for(int l = lA;l>=0;l--){
            countLeft++;
            if(l >=0){
                prL = ar[l]*prL;
            }
        }leftAR[exactL] =prL;
        for(int l = rA;l<ar.length;l++){
            countRight++;
            if(l <ar.length)
                prR = ar[l]*prR;
        }
        rightAR[exactR]=prR;
    }
}
