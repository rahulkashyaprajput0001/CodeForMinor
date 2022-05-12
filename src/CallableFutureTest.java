/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahul.kashyap
 */
import java.util.Random; 
import java.util.concurrent.Callable; 
import java.util.concurrent.FutureTask; 
  
class CallableExample implements Callable 
{ 
  
  public Object call() throws Exception 
  { 
    Random generator = new Random(); 
    Integer randomNumber = generator.nextInt(10); 
  
   // Thread.sleep(randomNumber * 1000); 
  
    return randomNumber; 
  } 
  
} 
  
public class CallableFutureTest 
{ 
  public static void main(String[] args) throws Exception 
  { 
  
    // FutureTask is a concrete class that 
    // implements both Runnable and Future 
    FutureTask[] randomNumberTasks = new FutureTask[10]; 
  
    for (int i = 0; i < 10; i++) 
    { 
      Callable callable = new CallableExample(); 
  
      // Create the FutureTask with Callable 
      randomNumberTasks[i] = new FutureTask(callable); 
  
      // As it implements Runnable, create Thread 
      // with FutureTask 
      Thread t = new Thread(randomNumberTasks[i]); 
      t.start(); 
    } 
  
    for (int i = 0; i < 10; i++) 
    { 
      // As it implements Future, we can call get() 
      System.out.println(randomNumberTasks[i].get()); 
  
      // This method blocks till the result is obtained 
      // The get method can throw checked exceptions 
      // like when it is interrupted. This is the reason 
      // for adding the throws clause to main 
    } 
  } 
} 