import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    static Queue<Integer>q1 = new LinkedList<>();
    Queue<Integer>q2 = new LinkedList<>();
    Queue<Integer>tmpQueue = new LinkedList<>();

    void pushTo(int ele){
        q1.add(ele);
    }

    int popFrom(){
        while (q1.size() !=1){
            q2.add(q1.peek());
            q1.remove();
        }
        int top = q1.remove();
        tmpQueue =q1;
        q1=q2;
        q2=tmpQueue;
        return  top;
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue obj = new ImplementStackUsingQueue();
        obj.pushTo(1);
        obj.pushTo(2);obj.pushTo(3);
        obj.pushTo(4);
        System.out.println("Queue"+ q1);
        System.out.println("pop"+ obj.popFrom());
        System.out.println("queue" + q1);
        System.out.println("pop" + obj.popFrom());
        System.out.println("queue" + q1);
        System.out.println("pop" + obj.popFrom());
        System.out.println("queue" + q1);


    }
}
