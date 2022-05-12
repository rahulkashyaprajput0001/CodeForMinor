/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author rahul.kashyap
 */
public class ReverseStackUsingRecursion {

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        System.out.println("Before Reversing" + stk);
        reverseStack(stk);
        System.out.println("After Reversing" + stk);

    }

    public static void reverseStack(Stack<Integer> stk) {
        int curPopedVal = 0;
        if (!stk.isEmpty()) {
            curPopedVal = stk.pop();
            reverseStack(stk);
            insertBackIntoStack(stk, curPopedVal);
        }

    }

    public static void insertBackIntoStack(Stack<Integer> stk, int passedPopedValue) {

        if (stk.isEmpty()) {
            stk.push(passedPopedValue);
            return;
        }
        int temp = stk.pop();
        insertBackIntoStack(stk, passedPopedValue);
        stk.push(temp);

    }
}
