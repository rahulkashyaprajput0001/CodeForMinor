/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class TestingConstructor {
    
    TestingConstructor(){
        System.out.println("constructer called");
    }
    
    int TestingConstructor(){
        return 3;
    }
    public static void main(String[] args) {
        
        TestingConstructor obj = new TestingConstructor();
        //System.out.println( obj.TestingConstructor());
    }
    
}
