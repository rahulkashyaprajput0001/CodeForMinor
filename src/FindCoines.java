import java.util.ArrayList;

public class FindCoines {
    public static void main(String[] args) {

        int arr[]= {1,2,5,10};
        getMinCoines(16,arr);
    }

    public static void getMinCoines(int target, int arr[]){
        ArrayList<String> list = new ArrayList<>();
        for(int i= arr.length-1;i>=0;i--){
            if (target == 0)
                break;
            int coins = target/arr[i];
            if (coins == 0)
                continue;
            target = target%arr[i];
            list.add( "Number of coins required for '" + arr[i] +"' are :" +coins);
        }
        System.out.println(list);

    }



}