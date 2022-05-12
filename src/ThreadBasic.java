public class ThreadBasic  {
    public static void main(String[] args) throws InterruptedException {
        Classb bObj = new Classb();
    Classc cObj = new Classc();
    Thread bTh = new Thread(bObj);
     Thread cTh = new Thread(cObj);
     bTh.start();
     bTh.join();
     cTh.start();
    }
 
}
 class Classb implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<1000;i++){
            System.out.println("B" + i);
        }
        
    }
    
}
    class Classc implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<1000;i++){
            System.out.println("C" + i);
        }
        
    }
    
}
   
    
        
    
