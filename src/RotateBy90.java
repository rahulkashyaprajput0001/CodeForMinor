public class RotateBy90 {
    public static void main(String[] args) {
      //  int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int mat[][] = 
        { 
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}, 
            {13, 14, 15, 16} 
        }; 
            for(int col = 3 ; col >=0 ;col-- ){
                for(int row = 0 ;row <=3 ;row++ ){
                System.out.print(mat[row][col]+" ");
                }
            System.out.println("");
        }
    }
    
}
