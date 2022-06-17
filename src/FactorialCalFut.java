import java.util.concurrent.Callable;

public class FactorialCalFut implements Callable<Integer> {
    int num;
    FactorialCalFut(int num){
        this.num = num;
    }
    @Override
    public Integer call() throws Exception {
       int res=1;
       for(int i=2 ;i<=num ;i++){
           res = res*i;

       }
        System.out.println("num is" + num);
       return res;
    }
}
