/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindkLargestElements {
    public static void main(String[] args) {
        int[] ar = {3,2,5,4,1,6,9,7};int k =2;
        printKLargetsElements(ar,k);
        //System.out.println(minHeap);          
    }
    
    public static void printKLargetsElements( int [] ar, int k) {
        PriorityQueue<Integer> minHeapQueue = new PriorityQueue<>();
         for(int i= 0;i<k;i++){
             minHeapQueue.add(ar[i]);
         }
         System.out.println("before any modifications" + minHeapQueue);
         for(int i = k;i<ar.length;i++){
             if(minHeapQueue.peek() > ar[i]){
                 continue;
             }
             else{
                 minHeapQueue.poll();
                 minHeapQueue.add(ar[i]);
             }
         } System.out.println("after any modifications" + minHeapQueue);
         System.out.println(minHeapQueue.peek());
        
    }
}
