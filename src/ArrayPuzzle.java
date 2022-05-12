/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahul.kashyap
 */
// Java program for product array puzzle 
// with O(n) time and O(1) space. 
public class ArrayPuzzle { 

	static void solve(int arr[], int n) 
	{ 
		// Initialize a variable to store the 
		// total product of the array elements 
		int prod = 1; 
		for (int i = 0; i < n; i++) 
			prod *= arr[i]; 

		// we know x/y mathematically is same 
		// as x*(y to power -1) 
		for (int i = 0; i < n; i++) 
			System.out.print( 
				(int)prod * Math.pow(arr[i], -1) + ", "); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		int arr[] = { 1,2,1,3,4 }; 
		int n = arr.length; 
		solve(arr, n); 
	} 
} 
// This code is contributed by Sitesh Roy 

