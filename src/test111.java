/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rahul.kashyap
 */

interface i1{
    void show();
    
}
public class test111 extends Parent  {
    
    public static void main(String[] args) {
        Parent p = new test111();
        p.show();
    }
    void show(){
        System.out.println("chi;ld");
    }
 
}


