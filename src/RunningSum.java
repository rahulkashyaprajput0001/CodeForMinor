public class RunningSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        arr[0]=1;
        for(int i=1;i< arr.length;i++){
            arr[i] = arr[i-1]+arr[i];

        }
        for(int i=0;i< arr.length;i++){
        System.out.println(arr[i]);}
    }
}
