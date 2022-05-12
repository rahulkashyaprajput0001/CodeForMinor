/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahul.kashyap
 */
public class ConsOverloadingWithDiffParam {

    static void sum(long a, int b) {
        System.out.println("A");
    }

    static void sum(long a, long b) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        sum(x, y);
    }
}
