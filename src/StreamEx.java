/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author rahul.kashyap
 */
class StreamEx { 
    public static void main(String[] args) 
    { 
  
        // Creating a String array 
        String[] arr = { "Geeks", "for", "Geeks" }; 
  
        // Using Arrays.stream() to convert 
        // array into Stream 
        Stream<String> stream = Arrays.stream(arr); 
   //     System.out.println(stream);
  
        // Displaying elements in Stream 
        stream.forEach(str -> System.out.print(str + "---- ")); 
        
        
        
        
        
        int arr2[] = { 1, 2, 3, 4, 5 }; 
  
        // Using Arrays.stream() to convert 
        // array into Stream 
        IntStream stream2 = Arrays.stream(arr2); 
  
        // Displaying elements in Stream 
        stream2.forEach(str -> System.out.print(str + " "));
    } 
} 