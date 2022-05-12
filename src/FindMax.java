public class FindMax {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,2,34,65,44};
        int small = Integer.MIN_VALUE;
        System.out.println(small);
        for (int ele : arr ){
            if(ele> small){
                small = ele;
            }

        }
        System.out.println(small);
    }
}
