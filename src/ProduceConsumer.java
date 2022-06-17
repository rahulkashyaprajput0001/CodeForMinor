import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProduceConsumer {
static LinkedList <Integer> list = new LinkedList<Integer>();
   static int  cap =10;
   static Object lock = new Object();
  static  AtomicInteger atomInt = new AtomicInteger(1);


    public static void main(String[] args) {
          Producer pro =  new Producer();
    Consumer con =  new Consumer();
    Thread t1 = new Thread(pro);
    Thread t2 = new Thread(con);
    t1.start();
    t2.start(); 
    }
    
    
    static class Producer implements Runnable{
       
        @Override
       public void run(){ 
        while(true){
        
        synchronized(lock){
            if(list.size() > 0){
                try {
                    lock.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProduceConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                if(list.size() < cap ){
            System.out.println("Producer" + atomInt.incrementAndGet());
               list.add(atomInt.incrementAndGet());
            lock.notifyAll();
                }
            }
            
        }
        
    }
    }

        
    }

    static class Consumer implements Runnable{
    
        
        @Override
     
        public void run() { 
        while(true){
        
        synchronized(lock){
            if(list.size() == 0){
                try {
                    lock.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProduceConsumer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                if(list.contains(atomInt.decrementAndGet())){
            System.out.println( "Consumer" + list.removeFirst());
            lock.notifyAll();
                }
            }
            
        }
        
    }
    }
    }
}

