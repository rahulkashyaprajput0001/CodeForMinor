import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class FactorialCalFutImpl {
    public static void main(String[] args) {
        //   ExecutorService service  = Executor.newFixedThreadPool(2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Random ran = new Random();
        List<Future<Integer>> fut = new ArrayList<>();;
        for (int i = 0; i < 4; i++) {
            int num = ran.nextInt(10);

            FactorialCalFut f = new FactorialCalFut(num);

            Future<Integer> result = executorService.submit(f);
            fut.add(result);
        }
        for (Future<Integer> future : fut) {
            try {
                System.out.println("Future result is - " + " - " + future.get() + "; And Task done is " + future.isDone());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executorService.shutdown();
    }

}
