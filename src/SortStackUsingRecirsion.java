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
public class SortStackUsingRecirsion {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(2);
        stk.push(1);
        stk.push(3);
        stk.push(0);
        keepElemInCallStack(stk);
        System.out.println(stk);
    }
    
    
    public static void sortElemInStack(Stack<Integer> stk, int cEle) {

        if (stk.isEmpty() || cEle > stk.peek()) {
            stk.push(cEle);
            return;
        }
        int temp = stk.pop();
        sortElemInStack(stk, cEle);
        stk.push(temp);

    }
    public static void keepElemInCallStack(Stack<Integer> stk) {

        if (!stk.isEmpty()) {
            int val =  stk.pop();
            keepElemInCallStack(stk);
            sortElemInStack(stk, val);
        }

    }
}
