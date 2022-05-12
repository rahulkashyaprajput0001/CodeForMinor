/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Stack;

/**
 *
 * @author rahul.kashyap
 */
public class RemoveMiddleElemFromStackUsingRecursion {
    static int stkSize=0,currentIndex= 0;;
    public static void main(String[] args) {
        
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);
        stk.push(7);
        stkSize =  stk.size();
        keepElemInCallStack(stk);
        System.out.println(stk);
    }
    public static void keepElemInCallStack(Stack<Integer> stk){
        int currPopedEle=0;
        if(!stk.isEmpty()){
            currPopedEle = stk.pop();
            keepElemInCallStack(stk);
            pushBackInStackExcludingMiddle(stk, currentIndex = currentIndex+1,currPopedEle);
        }
        
    }
    public static void pushBackInStackExcludingMiddle(Stack<Integer> stk,int currentIndex,int currentPopedEle){
        System.out.println("passed ele" + currentPopedEle);
        if(currentIndex != (stkSize/2)+1){
              stk.push(currentPopedEle);
        }
      
    }
}
