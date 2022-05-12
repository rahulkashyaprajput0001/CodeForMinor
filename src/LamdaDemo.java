/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author rahul.kashyap
 */
public class LamdaDemo {
    
    public static void main(String[] args) {
        int []ar ={1,2,3,4,5};
        //for(int i=0 ; i< ar.length;i++){
          //  (ar[i])-> System.out.println(ar[i]) ;
        //}
        String[] arr = { "Geeks", "for", "Geeks" }; 

		// Using Arrays.stream() to convert 
		// array into Stream 
		Stream<String> stream = Arrays.stream(arr); 
                stream.forEach(str->System.out.println(str+" "));
    //  System.out.println(stream);
    }
}
