/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahul.kashyap
 */
public class Child extends Parent{
   @Override
   void show(){
        System.out.println("child");
    }
    public static void main(String[] args) {
       Parent p = new Child();
       p.show();
       
    }
}
