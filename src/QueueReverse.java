import java.util.Queue;
import java.util.LinkedList; 

public class QueueReverse {
    
   static public void reverseQ(Queue<Integer> q){
        int val;
       if(!q.isEmpty()){
           val = q.remove();
           reverseQ(q);
           q.add(val);
       }
       System.out.println(q);
    }
   static public void printQ(Queue<Integer>Q){
       while(!Q.isEmpty()){
           System.out.println(Q.peek());
       }
   }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        reverseQ(queue);
    }
   
}
