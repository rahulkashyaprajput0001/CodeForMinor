// Java program to find the only 
// repeating element in an array 
// where elements are from 1 to n-1. 
import java.lang.Math.*; 

class GFG 
{ 
	// Function to find repeted element 
	static int FindOnlyRepeated(int arr[], int n) 
	{ 
		int missingElement = 0; 
	
		// indexing based 
		for (int i = 0; i < n; i++){ 
	
			int element = arr[Math.abs(arr[i])]; 
	
			if(element < 0){ 
				missingElement = arr[i]; 
				break; 
			} 
		
                        System.out.println(arr[Math.abs(arr[i])]);
		arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
                
                   
	} 
	
	return Math.abs(missingElement); 
	
	} 
	
	// Driver code 
	public static void main(String[] args) 
	{ 
		int arr[] = {1,3,2,3,4}; 
	
		int n = arr.length; 
	
		System.out.println(FindOnlyRepeated(arr, n)); 
                for(int i=0 ; i<n;i++)
                {
                //    System.out.println(arr[i]);
                }
	
	} 
} 

