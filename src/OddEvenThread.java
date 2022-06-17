import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OddEvenThread {
    public static void main(String[] args) {
        AtomicInteger atom =  new AtomicInteger(1);
        Object lock = new Object();
        evenThread eThread = new evenThread(atom, lock);
        oddThread oThread = new oddThread(atom, lock);
        Thread t1E = new Thread(eThread);
        Thread t1O = new Thread(oThread);
        t1O.start();
        t1E.start();
        
    }
   static class evenThread implements Runnable{
        AtomicInteger atom;
         Object lock;
        int limit = 20;
        evenThread(AtomicInteger atom, Object lock){
            this.atom = atom;
            this.lock = lock;   
        }
        @Override
        public void run() {
            synchronized(lock)
            {
                while(atom.get()  <= limit){
                    if(atom.get() % 2 != 0){
                        try {
                            lock.wait();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(OddEvenThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else{
                        System.out.println("EvenThread"  + atom);
                   //     try{
                     //   Thread.sleep(10);
                       // } catch (InterruptedException ex) {
                        //    Logger.getLogger(OddEvenThread.class.getName()).log(Level.SEVERE, null, ex);
                        //}
                         atom.incrementAndGet();
                    lock.notifyAll();
                    }
                   
                }
            }
            
        }

       
        
    }
   static class oddThread implements Runnable{
       int limit =20;
        AtomicInteger atom;
        Object lock;
        oddThread(AtomicInteger atom, Object lock){
            this.atom = atom;
            this.lock = lock;

        }
        @Override
        public void run() {
            synchronized(lock)
            {
                while(atom.get()  <= limit){
                    if(atom.get() % 2 == 0){
                        try {
                            lock.wait();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(OddEvenThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        System.out.println("OddThread" + atom);
                     //   try{
                        //Thread.sleep(10);
                       // } catch (InterruptedException ex) {
                          //  Logger.getLogger(OddEvenThread.class.getName()).log(Level.SEVERE, null, ex);
                       // }
                         atom.incrementAndGet();
                    lock.notifyAll();
                    }
                   
                }
            }
            
        }

        
        
    }
}
